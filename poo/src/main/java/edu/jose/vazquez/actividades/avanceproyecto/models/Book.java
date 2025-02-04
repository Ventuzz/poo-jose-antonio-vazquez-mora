package edu.jose.vazquez.actividades.avanceproyecto.models;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private int year;
    private String genre;

    public Book(String title, String author, String isbn, boolean available, int year, String genre) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setAvailable(available);
        setYear(year);
        setGenre(genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("El ISBN no puede estar vacío.");
        }
        this.isbn = isbn;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        if (available == false ) {
            throw new IllegalArgumentException("El libro no está disponible.");   
        }
        this.available = available;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0 && year > 2025) {
            throw new IllegalArgumentException("El año no puede ser negativo ni mayor a nuestro año actual, 2025.");            
        }
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.trim().isEmpty()) {
            throw new IllegalArgumentException("El género no puede estar vacío.");
        }
        this.genre = genre;
    }


}
