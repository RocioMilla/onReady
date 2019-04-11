package com.onready;

import java.math.BigDecimal;

public class Moto extends Vehiculo {
    private String Cilindrada;

    public Moto(String marca, String modelo, Double precio,String cilindrada) {
        super(marca, modelo, precio);
        setCilindrada(cilindrada);
    }

    public String showDetails(){
        String marca = getMarca();
        String modelo = getModelo();
        Double precio = getPrecio();
        String cilindrada = getCilindrada();
        return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: "+ cilindrada + " // Precio: $" + precio;
    }
    //getter and setter

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        Cilindrada = cilindrada;
    }
}
