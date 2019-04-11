package com.onready;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        //list
        ArrayList<Vehiculo> Vehiculos = createObjects();
        StringBuilder str = new StringBuilder();
        for (Vehiculo vehiculo : Vehiculos) {
            str.append(vehiculo.showDetails());
            str.append("\n");
        }

        //lowest price
        Vehiculo cheapest =  Collections.min(Vehiculos, Comparator.comparing(c -> c.getPrecio()));
        System.out.println(str);
        System.out.println("=================================");
        System.out.println("Vehículo más barato: "+  cheapest.getMarca() + " " + cheapest.getModelo() + "\n");

    }

    public static ArrayList<Vehiculo> createObjects(){
        Auto Peugeot = new Auto("Peugeot", "206", 200000.00, 4);
        Moto Honda = new Moto("Honda", "Titan", 60000.00, "125c");
        Auto Peugeot2 = new Auto("Peugeot", "208", 250000.00, 5);
        Moto Yamaha = new Moto("Yamaha", "YBR", 80500.50, "160c");
        ArrayList<Vehiculo> Vehiculos = new ArrayList<Vehiculo>();
        Vehiculos.add(Peugeot);
        Vehiculos.add(Honda);
        Vehiculos.add(Peugeot2);
        Vehiculos.add(Yamaha);
        return Vehiculos;
    }
}