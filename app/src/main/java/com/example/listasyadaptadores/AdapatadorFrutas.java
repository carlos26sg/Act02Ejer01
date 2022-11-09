package com.example.listasyadaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.act02ejer01.R;

public class AdapatadorFrutas extends BaseAdapter{

    Fruta[] frutas;
    Context con;

    public AdapatadorFrutas (Fruta[] frutas, Context con){
        this.con = con;
        this.frutas =frutas;
    }

    //Devolvemos la cantidad de frutas que hay
    @Override
    public int getCount() {
        return frutas.length;
    }

    //Devolvemos el elemento i del array de frutas
    @Override
    public Object getItem(int i) {
        return frutas[i];
    }

    //Devolvemos el Item del elemento i del array de frutas
    @Override
    public long getItemId(int i) {
        return frutas[i].getId();
    }

    //Generamos el layout
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //Cogemos el Layout y generamos una vista a partir del modelo
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vista_elemento = inflater.inflate(R.layout.item_frutas, viewGroup, false);

        //Referenciamos variables para cada elemento que tenemos y cargamos datos
        ImageView imagen = (ImageView) vista_elemento.findViewById(R.id.iv_imagen);
        TextView nombre = (TextView) vista_elemento.findViewById(R.id.tv_nombre);
        Button menos = (Button) vista_elemento.findViewById(R.id.btn_menos);
        Button mas = (Button) vista_elemento.findViewById(R.id.btn_mas);
        TextView cantidad = (TextView) vista_elemento.findViewById(R.id.tv_cantidad);

        //Cargamos los datos de la fruta
        imagen.setImageBitmap(frutas[i].getImagen());
        nombre.setText(frutas[i].getNombre());
        cantidad.setText(String.valueOf(frutas[i].getCantidad()));

        //onClick de boton menos para restar cantidad
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cant = Integer.parseInt(cantidad.getText().toString());
                //if para no restar si la cantidad es cero
                if (cant > 0){
                    cant--;
                    cantidad.setText(String.valueOf(cant));
                    frutas[i].setCantidad(cant);
                }
            }
        });

        //onClick de boton mas para sumar cantidad
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cant = Integer.parseInt(cantidad.getText().toString());
                    cant++;
                    cantidad.setText(String.valueOf(cant));
                    frutas[i].setCantidad(cant);
            }
        });

        vista_elemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = frutas[i].getNombre() + " X " + String.valueOf(frutas[i].getCantidad());
                Toast.makeText(con.getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
            }
        });

        return vista_elemento;
    }
}
