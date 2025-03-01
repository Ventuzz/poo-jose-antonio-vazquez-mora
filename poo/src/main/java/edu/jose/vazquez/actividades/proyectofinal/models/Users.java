package edu.jose.vazquez.actividades.proyectofinal.models;

/**
 * Clase que se encarga de gestionar los usuarios del sistema
 */
public class Users {

    private String username;
    private String password;
    private int age;
    private String name;
    private String tipo;

    public Users(String username, String password, int age, String name, String tipo) {
        setUsername(username);
        setPassword(password);
        setAge(age); 
        setName(name);
        setTipo(tipo);
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
    
    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setTipo(String tipo) {
        
        this.tipo = tipo;
    }
}
