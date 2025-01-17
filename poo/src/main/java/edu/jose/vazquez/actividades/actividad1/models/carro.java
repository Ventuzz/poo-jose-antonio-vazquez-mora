package edu.jose.vazquez.actividades.actividad1.models;

public class carro {
    private String modelo;
    private String marca;
    private int numPuertas;
    private String color;

    public String toString(){
        return "carro{" +
            "modelo='" + modelo + '\''+
            ", marca='" + marca + '\''+
            ", numPuertas=" + numPuertas +
            ", color='" + color + '\''+
            '}';
        }
    
    public carro(String modelo, String marca, int numPuertas, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.numPuertas = numPuertas;
        this.color = color;
    }

    public int getNumPuertas(){
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas){
        if(numPuertas<2 || numPuertas>5){
            throw new IllegalArgumentException("numero de puertas valid esta entre 2 y 5");
        }
        this.numPuertas = numPuertas;
    }
}

