package com.onready;

import java.math.BigDecimal;

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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
