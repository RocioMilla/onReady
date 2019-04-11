package com.onready;
import java.math.BigDecimal;

public class Vehiculo {
    private String marca;
    private String modelo;
    private BigDecimal precio;

    public Vehiculo(String marca, String modelo, BigDecimal precio) {
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
