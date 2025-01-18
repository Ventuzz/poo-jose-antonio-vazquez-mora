package edu.jose.vazquez.actividades.actividad1.process;

import java.util.ArrayList;
import java.util.List;

import edu.jose.vazquez.actividades.actividad1.models.Car;

/**
 * Clase que se encarga de gestionar el stock de carros.
 * Proporciona métodos para agregar carros y obtener la lista de carros disponibles.
 */

public class StockManager {
    ArrayList<Car> stock;
    /**
     * Se encarga de inicializar el stock de carros en una lista vacia para despues almacenarlos
     */
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

    /**
     * Devuelve la lista de carros disponibles
     * @return una lista de objetos tipo Car con la información de los carros disponibles
     */
    public List<Car> getStock(){
        return this.stock;
    }

}
