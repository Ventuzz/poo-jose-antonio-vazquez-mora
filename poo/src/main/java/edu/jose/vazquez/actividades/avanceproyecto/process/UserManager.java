package edu.jose.vazquez.actividades.avanceproyecto.process;

import edu.jose.vazquez.actividades.avanceproyecto.models.Users;
import java.util.ArrayList;

/**
 * Clase que se encarga de gestionar los usuarios del sistema
 */
public class UserManager {

    ArrayList<Users> users;
    
    /**
     * Constructor de la clase UserManager que inicializa la lista de usuarios y añade un usuario por defecto
     * Se crea un usuario por defecto con el nombre de usuario "admin" y la contraseña "admin"
    */
    public UserManager(){
        this.users = new ArrayList<>();
        addUser("admin", "admin");
    }
    /**
     * Método que añade un usuario a la lista de usuarios   
     * @param username
     * @param password  
     * Se crea un nuevo usuario con el nombre de usuario y contraseña que se pasan como parámetros
    */
    public void addUser(String username, String password){
        Users newUser = new Users(username, password);
        users.add(newUser);
    }
    /**
     * Método que devuelve la lista de usuarios
     * @return users
    */
    public ArrayList<Users> getUsers(){
        return this.users;
    }
    /**
     * Método que valida si el usuario y la contraseña que se pasan como parámetros coinciden con algún usuario de la lista
     * @param username
     * @param password
     * @return boolean
     * Se recorre la lista de usuarios y se compara el nombre de usuario y la contraseña con los que se pasan como parámetros
     * Si se encuentra un usuario con el mismo nombre de usuario y contraseña se devuelve true, en caso contrario se devuelve false
    */
    public boolean validateUser(String username, String password) {
        for (Users user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Método que valida si el nombre de usuario que se pasa como parámetro es el primer usuario de la lista
     * @param username
     * @return
    */
    public boolean isFirstUser(String username) {
        return users.size() > 0 && users.get(0).getUsername().equals(username);
    }
    /**
     * Método que presta un libro a un usuario  
     * @param username
     * @param bookTitle
     * Se recorre la lista de usuarios y se compara el nombre de usuario con el que se pasa como parámetro
     * Si se encuentra el usuario se le presta el libro que se pasa como parámetro
    */
    public void lendBookToUser(String username, String bookTitle){
        for(Users user : users){
            if (user.getUsername().equals(username)) {
                user.lendBook(bookTitle);
                break;
            }
        }
    }
    /**
     * Método que devuelve un libro a la biblioteca
     * @param username
     * @param bookTitle
     * Se recorre la lista de usuarios y se compara el nombre de usuario con el que se pasa como parámetro
     * Si se encuentra el usuario se devuelve el libro que se pasa como parámetro
    */
    public ArrayList<String> getBorrowedBooks(String username){
        for(Users user : users){
            if (user.getUsername().equals(username)) {
                return user.borrowedBooks;

            }
        }
        return new ArrayList<>();
    }
}


