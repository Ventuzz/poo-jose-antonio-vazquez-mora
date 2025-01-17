package edu.jose.vazquez.actividades.actividad1.process;

import java.util.ArrayList;

import edu.jose.vazquez.actividades.actividad1.models.carro;

public class StockManager {
    ArrayList<carro> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }

    /**
     * genera un nuevo objeto con la información de un carro y se agrega al stock
     * @param modelo
     * @param marca
     * @param numPuertas
     * @param color
     */

    public void addCarro(String modelo, String marca, int numPuertas, String color){
        carro newCarro = new carro(modelo, marca, numPuertas, color);
        stock.add(newCarro);
    }

    public void printStock(){
        System.out.println("El catalogo de carros actualmente es de: ");
        System.out.println("==========================================");
        System.out.println(stock);
    }

}
