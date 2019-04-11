package com.onready;

import java.math.BigDecimal;

public class Auto extends Vehiculo {
    private Integer puertas;

    public Auto(String marca, String modelo, Double precio, Integer puertas) {
        super(marca, modelo, precio);
        setPuertas(puertas);
    }
    public String showDetails(){
        String marca = getMarca();
        String modelo = getModelo();
        Double precio = getPrecio();
        Integer puertas = getPuertas();
        return "Marca: " + marca + " // Modelo: " + modelo + " //Puertas: "+ puertas + " // Precio: $" + precio;
    }

    //getter and setter
    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }
}
