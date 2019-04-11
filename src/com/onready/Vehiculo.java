package com.onready;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String precio;

    public Vehiculo(String marca, String modelo, String precio) {
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }
    abstract public String showDetails();

    //getter setters
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
