package com.onready;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Vehiculo> Vehiculos = createObjects();
        StringBuilder str = new StringBuilder();
        for (Vehiculo vehiculo : Vehiculos) {
            str.append(vehiculo.showDetails());
            str.append("\n");
        }
        System.out.println(str);
    }

    public static ArrayList<Vehiculo> createObjects(){
        Auto Peugeot = new Auto("Peugeot", "206", "200.000,00", 4);
        Moto Honda = new Moto("Honda", "Titan", "60.000,00", "125c");
        Auto Peugeot2 = new Auto("Peugeot", "208", "250.000,00", 5);
        Moto Yamaha = new Moto("Yamaha", "YBR", "$80.500,50", "160c");
        ArrayList<Vehiculo> Vehiculos = new ArrayList<Vehiculo>();
        Vehiculos.add(Peugeot);
        Vehiculos.add(Honda);
        Vehiculos.add(Peugeot2);
        Vehiculos.add(Yamaha);
        return Vehiculos;
    }
}