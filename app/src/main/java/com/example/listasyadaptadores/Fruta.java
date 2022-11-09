package com.example.listasyadaptadores;

import android.graphics.Bitmap;

public class Fruta {

    //Variables con las que trabajaremos
    String nombre;
    int cantidad;
    Bitmap imagen;
    long id;

    //Constructor
    public Fruta(long id, String nombre, Bitmap imagen, int x, int y){

        this.id = id;
        this.nombre = nombre;
        this.cantidad = 1;
        //Partición del Bitmap en los trozos correspondientes
        this.imagen = Bitmap.createBitmap(imagen,
                x*imagen.getWidth()/6,
                y*imagen.getHeight()/5,
                imagen.getWidth()/6,
                imagen.getHeight()/5);
        imagen = Bitmap.createScaledBitmap(imagen, 128,128, false);
    }

    //Getters y Setters necesarios
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public long getId() {
        return id;
    }

}
