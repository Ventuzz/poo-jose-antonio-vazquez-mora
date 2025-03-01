package edu.jose.vazquez.actividades.proyectofinal.models;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private int year;
    private String genre;
    private int popularity;


    public Book(String title, String author, String isbn, boolean available, int year, String genre) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setAvailable(available);
        setYear(year);
        setGenre(genre);
        popularity=0;
    }

    public boolean isAvailable(){
        if(!available){
            available=false;
            return false;
        }
        return true;
    }

    public boolean returnBook(){
        if (available) {
            available= true;
            return true;
        }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
