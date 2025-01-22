package edu.jose.vazquez.actividades.actividad2.models;

//Clase que almacena los nombres de las personas y los métodos para acceder a ellos
public class Data {
    private String name;
    public static String[] nombres= {"Jose", "Maria", "Pedro", "Ana", "Juan", "Luis", "Carlos", "Sofia", "Fernanda", "Ricardo"};

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
