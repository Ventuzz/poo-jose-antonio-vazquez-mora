package edu.jose.vazquez.actividades.avanceproyecto.models;

import java.util.ArrayList;
/**
 * Clase que se encarga de gestionar los usuarios del sistema
 */
public class Users {

    public ArrayList<String> borrowedBooks;
    private String username;
    private String password;
    /**
     * 
     * @param username
     * @param password
     */
    public Users(String username, String password) {
        setUsername(username);
        setPassword(password);
        borrowedBooks= new ArrayList<>();
    }
/**
     * Método que añade un usuario a la lista de usuarios
     * @param book
     * Se añade el libro a la lista de libros prestados
    */
    public void lendBook(String book){
        borrowedBooks.add(book);
    }
    /**
     * Método que devuelve la lista de libros prestados
     * @return borrowedBooks
    */
    public void returnBook(String book){
        borrowedBooks.remove(book);
    }
    /**
     * Método que devuelve la lista de libros prestados
     * @return
    */


    public ArrayList<String> getBorrowedBooks(){
        return(borrowedBooks);
    }
     /**
     * Método que añade un usuario a la lista de usuarios
     * @param username
     * @param password
     * Se crea un nuevo usuario con el nombre de usuario y contraseña que se pasan como parámetros
    */
    public String getUsername() {
        return username;
    }


    
    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío.");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía.");
        }
        this.password = password;
    }


}
