package edu.jose.vazquez.actividades.actividad2.models;

public class Name {
    private String name;
    public static String[] nombres= {"Jose", "Maria", "Pedro", "Ana", "Juan", "Luis", "Carlos", "Sofia", "Fernanda", "Ricardo"};

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
