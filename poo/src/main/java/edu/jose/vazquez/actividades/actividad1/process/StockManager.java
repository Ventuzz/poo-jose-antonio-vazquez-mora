package edu.jose.vazquez.actividades.actividad1.process;

import java.util.ArrayList;
import java.util.List;

import edu.jose.vazquez.actividades.actividad1.models.Car;

public class StockManager {
    ArrayList<Car> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }

    /**
     * genera un nuevo objeto con la información de un carro y se agrega al stock
     * @param modelo
     * @param marca
     * @param placa
     * @param color
     */

    public void addCarro(String modelo, String marca, String placa, String color){
        Car newCarro = new Car(modelo, marca, placa, color);
        stock.add(newCarro);
    }

    public List<Car> getStock(){
        return this.stock;
    }

}
