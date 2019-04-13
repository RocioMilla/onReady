package com.onready;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        ArrayList<Vehiculo> vehiculos = createObjects();
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.showDetails());
        }
        Vehiculo cheapest =  Collections.min(vehiculos, Comparator.comparing(c -> c.getPrecio()));
        Vehiculo mostExpensive =  Collections.max(vehiculos, Comparator.comparing(c -> c.getPrecio()));
        Vehiculo withLetterY = null;
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getModelo().contains("Y")){
                withLetterY = vehiculo;
            }
        }
        System.out.println("=================================");
        System.out.println("Vehículo más caro: "+  cheapest.getMarca() + " " + cheapest.getModelo());
        System.out.println("Vehículo más barato: "+  mostExpensive.getMarca() + " " + mostExpensive.getModelo());
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+ withLetterY.getMarca()+ " " + withLetterY.getModelo() + " " + withLetterY.getPrecioArgentina());
        System.out.println("=================================");
        Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getPrecio).reversed());
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
    }

    public static ArrayList<Vehiculo> createObjects(){
        Auto Peugeot = new Auto("Peugeot", "206", 200000.00, 4);
        Moto Honda = new Moto("Honda", "Titan", 60000.00, "125c");
        Auto Peugeot2 = new Auto("Peugeot", "208", 250000.00, 5);
        Moto Yamaha = new Moto("Yamaha", "YBR", 80500.50, "160c");
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(Peugeot);
        vehiculos.add(Honda);
        vehiculos.add(Peugeot2);
        vehiculos.add(Yamaha);
        return vehiculos;
    }
}