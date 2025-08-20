package edu.jose.vazquez.actividades.avanceproyecto.process;
import edu.jose.vazquez.actividades.avanceproyecto.models.Book;
import java.util.ArrayList;
/**
 * Clase que se encarga de gestionar los libros del sistema
 * Se encarga de añadir libros a la lista de libros
 * Devuelve la lista de libros
 */
public class BookManager {

    ArrayList<Book> books;
    /**
     * Constructor de la clase BookManager que inicializa la lista de libros y añade un libro por defecto
     * Se crea un libro por defecto con el título "juego de tronos", el autor "sadasd", el isbn "asdasd", disponible, el año 2008 y el género "fantasia"
    */
    public BookManager(){
        this.books = new ArrayList<>();
        addBook("juego de tronos", "sadasd", "asdasd", true, 2008, "fantasia");
    }
    /**
     * Método que añade un libro a la lista de libros
     * @param title
     * @param author
     * @param isbn
     * @param available
     * @param year
     * @param genre
     * Se crea un nuevo libro con el título, autor, isbn, disponibilidad, año y género que se pasan como parámetros
     * Se añade el libro a la lista de libros 
    */
    public void addBook(String title, String author, String isbn, boolean available, int year, String genre){
        Book newBook = new Book(title, author, isbn, available, year, genre);
        books.add(newBook);
    }
    /**
     * Método que devuelve la lista de libros
     * @return books
    */
    public ArrayList<Book> getBooks(){
        return this.books;
    }

    
    

}
