package com.onready;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Double precio;

    public Vehiculo(String marca, String modelo, Double precio) {
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }
    abstract public String showDetails();

    public String getPrecioArgentina(){
        Locale argentinaLocale = new Locale("es", "AR");
        NumberFormat argentina  = NumberFormat.getCurrencyInstance(argentinaLocale);
        Double precio = getPrecio();
        String precioArgentina = argentina.format(precio);
        return precioArgentina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
