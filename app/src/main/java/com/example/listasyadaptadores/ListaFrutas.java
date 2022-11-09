package com.example.listasyadaptadores;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.android.act02ejer01.R;

public class ListaFrutas extends AppCompatActivity {

    Fruta[] frutas = new Fruta[30];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_frutas);

        //Añadimos flecha para volver a la MainActivity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Carga de Bitmap
        Bitmap bitmapFrutas = BitmapFactory.decodeResource(getResources(),R.drawable.bitmap);
        cargaFrutas(bitmapFrutas);
        //Creamos el adaptador
        AdapatadorFrutas adaptador = new AdapatadorFrutas(frutas, this);
        ListView listaFrutas = (ListView) findViewById(R.id.lv_lista);
        listaFrutas.setAdapter(adaptador);
    }

    public void cargaFrutas(Bitmap bitmapFrutas){
        frutas[0] = new Fruta(0, "Naranja", bitmapFrutas, 0,0);
        frutas[1] = new Fruta(0, "Maiz", bitmapFrutas, 1,0);
        frutas[2] = new Fruta(0, "Chili", bitmapFrutas, 2,0);
        frutas[3] = new Fruta(0, "Berenjena", bitmapFrutas, 3,0);
        frutas[4] = new Fruta(0, "Manzana", bitmapFrutas, 4,0);
        frutas[5] = new Fruta(0, "Platano", bitmapFrutas, 5,0);
        frutas[6] = new Fruta(0, "Piña", bitmapFrutas, 0,1);
        frutas[7] = new Fruta(0, "Pepino", bitmapFrutas, 1,1);
        frutas[8] = new Fruta(0, "Kiwi", bitmapFrutas, 2,1);
        frutas[9] = new Fruta(0, "Pera", bitmapFrutas, 3,1);
        frutas[10] = new Fruta(0, "Mango", bitmapFrutas, 4,1);
        frutas[11] = new Fruta(0, "Sandia", bitmapFrutas, 5,1);
        frutas[12] = new Fruta(0, "Lima", bitmapFrutas, 0,2);
        frutas[13] = new Fruta(0, "Fresa", bitmapFrutas, 1,2);
        frutas[14] = new Fruta(0, "Nabo", bitmapFrutas, 2,2);
        frutas[15] = new Fruta(0, "Pimiento", bitmapFrutas, 3,2);
        frutas[16] = new Fruta(0, "Limón", bitmapFrutas, 4,2);
        frutas[17] = new Fruta(0, "Cereza", bitmapFrutas, 5,2);
        frutas[18] = new Fruta(0, "Tomate", bitmapFrutas, 0,3);
        frutas[19] = new Fruta(0, "Calabaza", bitmapFrutas, 1,3);
        frutas[20] = new Fruta(0, "Patata", bitmapFrutas, 2,3);
        frutas[21] = new Fruta(0, "Calabacín", bitmapFrutas, 3,3);
        frutas[22] = new Fruta(0, "Granada", bitmapFrutas, 4,3);
        frutas[23] = new Fruta(0, "Zanahoria", bitmapFrutas, 5,3);
        frutas[24] = new Fruta(0, "Uva", bitmapFrutas, 0,4);
        frutas[25] = new Fruta(0, "Cebolla", bitmapFrutas, 1,4);
        frutas[26] = new Fruta(0, "Brócoli", bitmapFrutas, 2,4);
        frutas[27] = new Fruta(0, "Mandarina", bitmapFrutas, 3,4);
        frutas[28] = new Fruta(0, "Ciruela", bitmapFrutas, 4,4);
        frutas[29] = new Fruta(0, "Ajo", bitmapFrutas, 5,4);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}