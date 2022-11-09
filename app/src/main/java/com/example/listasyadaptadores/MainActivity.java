package com.example.listasyadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.android.act02ejer01.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LlamadaAdaptadorSimpleSpinner();
        //onClick del boton Propio
        Button buttonPropio = (Button) findViewById(R.id.btnPropio);
        buttonPropio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LlamadaAdaptadorPropioListView();
            }
        });
        //onClick del boton Simple1
        Button btnSimple1 = (Button) findViewById(R.id.btnSimple1);
        btnSimple1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LLamadaAdaptadorSimpleListViewConstructor1();
            }
        });
        //onClick del boton Simple2
        Button btnSimple2 = (Button) findViewById(R.id.btnSimple2);
        btnSimple2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LLamadaAdaptadorSimpleListViewConstructor2();
            }
        });
        //onClick del boton Frutas
        Button btnFrutas = (Button) findViewById(R.id.btnFrutas);
        btnFrutas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Llamamos a la otra actividad y la abrimos
                Intent intent = new Intent(MainActivity.this, ListaFrutas.class);
                startActivity(intent);
            }
        });

    }

    //Función del botón Simple 1
    private void LLamadaAdaptadorSimpleListViewConstructor1() {
        // Este es el array en donde están los datos a visualizar
        String[] jmh_opciones = {"hola","adios","Viernes"};
        //Definimos el adaptador
        ArrayAdapter<String> jmh_adapter1 = new ArrayAdapter <String>
                (getApplicationContext(), androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,jmh_opciones);
        //Creamos variable que apunte al ListView del Layout
        ListView jmh_origen = (ListView) findViewById(R.id.listviewjmh);
        //Inflamos los valores del ListView usando el adaptador
        jmh_origen.setAdapter(jmh_adapter1);
    }

    //Función del botón Simple 2
    private void LLamadaAdaptadorSimpleListViewConstructor2() {
        // Este es el array en donde están los datos a visualizar
        String[] jmh_opciones = {"hola","adios"};
        //Definimos el adaptador
        ArrayAdapter<String>adapter_jmh=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_2,android.R.id.text1, jmh_opciones);
        //Creamos variable que apunte al ListView del Layout
        ListView jmh_origen = (ListView) findViewById(R.id.listviewjmh);
        //Inflamos los valores del ListView usando el adaptador
        jmh_origen.setAdapter(adapter_jmh);
    }

    //Función del Spinner
    private void LlamadaAdaptadorSimpleSpinner() {
        // Este es el array en donde están los datos a visualizar
        String[] jmh_opciones = {"hola","adios"};
        //Definimos el adaptador
        ArrayAdapter<String> jmh_adapter1 = new ArrayAdapter <String> (MainActivity.this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,jmh_opciones);
        //Creamos variable que apunte al spinner del Layout
        Spinner jmh_origen = (Spinner) findViewById(R.id.spinnerjmh);
        //Inflamos los valores del spinner usando el adaptador
        jmh_origen.setAdapter(jmh_adapter1);
    }

    //Función del botón Propio
    private void LlamadaAdaptadorPropioListView() {
        // Creamos los datos
        ArrayList<User> arrayOfUsers_jmh = new ArrayList<User>();
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        arrayOfUsers_jmh.add(new User("Nathan", "San Diego"));
        // Definimos el adaptador propio. En este caso no posee layout.
        UsersAdapter adapter_jmh = new UsersAdapter(this, arrayOfUsers_jmh);
        // Attach the adapter to a ListView
        ListView listView_jmh = (ListView) findViewById(R.id.listviewjmh);
        listView_jmh.setAdapter(adapter_jmh);
        // Limpiar el adaptador
        //adapter_jmh.clear();
    }
}









