package edu.jose.vazquez.actividades.actividad1.models;

public class Car {
    private String modelo;
    private String marca;
    private String placa;
    private String color;

    public String toString(){
        return "carro{" +
            "modelo='" + modelo + '\''+
            ", marca='" + marca + '\''+
            ", placa=" + placa +
            ", color='" + color + '\''+
            '}';
        }
    
    public Car(String modelo, String marca, String placa, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.color = color;
    }

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

