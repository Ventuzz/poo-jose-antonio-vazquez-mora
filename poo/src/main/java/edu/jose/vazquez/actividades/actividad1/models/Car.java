package edu.jose.vazquez.actividades.actividad1.models;

/**
 * Clase que representa un carro con los aributos de modelo, marca, placa y color.
 * Proporciona métodos para obtener y modificar los atributos del carro.
 * También proporciona un método para mostrar la información del carro.
 */

public class Car {
    private String modelo;
    private String marca;
    private String placa;
    private String color;

    /**
     * Representa el carro en forma de texto con un diseño visual en forma de menú.
     * @return una cadena de texto con la información del carro.
     */
    public String toString() {
        return "╔═══════════════════╗\n" +
               "║       Carro       ║\n" +
               "╚═══════════════════╝\n" +
               "╔═══════════════════╗\n" +
               "║ Modelo : " + modelo + "    ║\n" +
               "║ Marca  : " + marca + "   ║\n" +
               "║ Placa  : " + placa + "    ║\n" +
               "║ Color  : " + color + "     ║\n" +
               "╚═══════════════════╝";
    }

    /**
     * Constructor de la clase Car que cuenta con los siguientes parametros:
     * @param modelo
     * @param marca
     * @param placa
     * @param color
     */

    public Car(String modelo, String marca, String placa, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.color = color;
    }

    /**
     * Obtiene la placa del carro
     * @return la placa del carro
     */
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

}

