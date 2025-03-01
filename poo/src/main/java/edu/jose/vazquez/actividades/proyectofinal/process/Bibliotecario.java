package edu.jose.vazquez.actividades.proyectofinal.process;
import edu.jose.vazquez.actividades.proyectofinal.models.Book;
import edu.jose.vazquez.actividades.proyectofinal.models.Users;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Collection;
import edu.jose.vazquez.actividades.proyectofinal.models.Prestamos;

public class Bibliotecario {
    private HashMap<String, Users> users;
    private HashMap<String, Book> books;
    private ArrayList<Prestamos> prestamos;


    public Bibliotecario() {
        this.users = new HashMap<>();
        this.books = new HashMap<>();
        this.prestamos = new ArrayList<>(); 
        addUser("admin", "admin", 0, "admin");
        addUser("jose", "123", 25, "Jose Vazquez");
        addUser("juan", "123", 15, "Juan Perez");
        addUser("maria", "123", 10, "Maria Lopez");
        addUser ("pedro", "123", 0, "Pedro Martinez");
        addBook("Juego de tronos", "George R. Martin", "123", true, 1937, "Fantasia");
        addBook("El señor de los anillos", "J.R.R. Tolkien", "124", true, 1937, "Fantasia");
        addBook("Harry Potter", "J.K. Rowling", "125", true, 1937, "Fantasia");
        addBook("El principito", "Antoine de Saint-Exupéry", "126", true, 1937, "Fantasia");
        addBook("Cien años de soledad", "Gabriel García Márquez", "127", true, 1937, "Fantasia");
        addBook("Don Quijote de la Mancha", "Miguel de Cervantes", "128", true, 1937, "Fantasia");
    }



    public void addUser(String username, String password, int age, String name) {
        if (users.containsKey(username)) {
            System.out.println("Error: El usuario ya existe.");
            return;
        }

        String tipo;
        if (age <= 0) {
            tipo = "Usuario VIP";
        } else
        if (age < 12) {
            tipo = "Usuario JR";
        } else if (age <= 17) {
            tipo = "Usuario teens";
        } else {
            tipo = "Usuario adulto";
        }

        Users newUser = new Users(username, password, age, name, tipo);
        users.put(username, newUser);
    }

    public Boolean addPrestamo(String isbn, String username) {
        if (!users.containsKey(username)) {
            System.out.println("Error: Usuario no encontrado.");
            return false;
        }
        if (!books.containsKey(isbn)) {
            System.out.println("Error: Libro no encontrado.");
            return false;
        }
        if (!books.get(isbn).isAvailable()) {
            System.out.println("Error: Libro no disponible.");
            return false;
        }
        Users user = users.get(username);
        int prestamosActuales = librosPrestados(username);
        switch (user.getTipo()) {
            case "Usuario teens":
                if (prestamosActuales >= 1) {
                    System.out.println("Solo puedes tener 1 libro prestado a la vez, por favor devuelvelo antes de pedir otro.");
                    return false;
                }
                break;
            case "Usuario adulto":
                if (prestamosActuales >= 2) {
                    System.out.println("Solo puedes tener 2 libros prestados a la vez, por favor devuelve uno antes de pedir otro.");
                    return false;
                }
                break;
            case "Usuario VIP":
                if (prestamosActuales >= 5){
                    System.out.println("Solo puedes tener 5 libros prestados a la vez, por favor devuelve uno antes de pedir otro.");
                    return false;
                } 
                break;
        }
        switch (user.getTipo()) {
            case "Usuario teens":
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendar = Calendar.getInstance();
                Date currentDate = calendar.getTime();
                calendar.add(Calendar.DAY_OF_MONTH, 7);
                Date returnDate = calendar.getTime();
                Prestamos newPrestamo = new Prestamos(isbn, username, dateFormat.format(currentDate), dateFormat.format(returnDate), "Prestado");
                prestamos.add(newPrestamo);
                books.get(isbn).setAvailable(false);
                return true;
            case "Usuario adulto":
                SimpleDateFormat dateFormatAdult = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendarAdult = Calendar.getInstance();
                Date currentDateAdult = calendarAdult.getTime();
                calendarAdult.add(Calendar.DAY_OF_MONTH, 7);
                Date returnDateAdult = calendarAdult.getTime();
                Prestamos newPrestamoAdult = new Prestamos(isbn, username, dateFormatAdult.format(currentDateAdult), dateFormatAdult.format(returnDateAdult), "Prestado");
                prestamos.add(newPrestamoAdult);
                books.get(isbn).setAvailable(false);
                return true;
            case "Usuario VIP":
                SimpleDateFormat dateFormatVip = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendarVip = Calendar.getInstance();
                Date currentDateVip = calendarVip.getTime();
                calendarVip.add(Calendar.DAY_OF_MONTH, 14);
                Date returnDateVip = calendarVip.getTime();
                Prestamos newPrestamoVip = new Prestamos(isbn, username, dateFormatVip.format(currentDateVip), dateFormatVip.format(returnDateVip   ), "Prestado");
                prestamos.add(newPrestamoVip);
                books.get(isbn).setAvailable(false);
                return true;
        }
        return false;
    }

    public int librosPrestados(String username) {
        int prestados = 0;
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getUsername().equals(username) && prestamo.getStatus().equals("Prestado")) {
                prestados++;
            }
        }
        return prestados;
    }

    public String validarUsuario(String username) {
        Users user = users.get(username);
        if (user == null) {
            System.out.println("Error: Usuario no encontrado.");
            return "Desconocido";
        }

        int age = user.getAge();
        if (age <= 12) return "Usuario JR";
        if (age <= 17) return "Usuario teens";
        if (age <=0) return "Usuario VIP";
        return "Usuario adulto";
    }

    public void devolverLibro(String isbn, String username) {
        if (!users.containsKey(username)) {
            System.out.println("Error: Usuario no encontrado.");
            return;
        }
        if (!books.containsKey(isbn)) {
            System.out.println("Error: Libro no encontrado.");
            return;
        }
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getUsername().equals(username) && prestamo.getTitle().equals(isbn) && prestamo.getStatus().equals("Prestado")) {
                prestamo.setStatus("Devuelto");
                books.get(isbn).setAvailable(true);
                System.out.println("Libro devuelto con éxito.");
                return;
            }
        }
        System.out.println("Error: No tienes este libro prestado.");
    }

    public void mostrarPrestamosAdministrador(){
        System.out.println("Préstamos activos:");
        boolean tienePrestamos = false;
        for (Prestamos prestamo : prestamos) {
            String isbn = prestamo.getTitle();
            String nombreLibro = books.containsKey(isbn) ? books.get(isbn).getTitle() : "Libro no encontrado";
            System.out.println("\n Libro: " + nombreLibro +
                               "\n | ISBN: " + isbn +
                               "\n | Usuario: " + prestamo.getUsername() +
                               "\n | Fecha de préstamo: " + prestamo.getFechaInicio() +
                               "\n | Fecha de devolución: " + prestamo.getFechaFin());
            tienePrestamos = true;
        }
        if (!tienePrestamos) {
            System.out.println("No hay préstamos activos en la biblioteca.");
        }
    }

    public void mostrarPrestamosActivos(String username) {
        if (!users.containsKey(username)) {
            System.out.println("Error: Usuario no encontrado.");
            return;
        }
    
        System.out.println("Préstamos activos de " + username + ":");
        boolean tienePrestamos = false;
    
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getUsername().equals(username) && prestamo.getStatus().equals("Prestado")) {
                String isbn = prestamo.getTitle();
                String nombreLibro = books.containsKey(isbn) ? books.get(isbn).getTitle() : "Libro no encontrado";
                System.out.println("\n Libro: " + nombreLibro +
                                   "\n | ISBN: " + isbn +
                                   "\n | Fecha de préstamo: " + prestamo.getFechaInicio() +
                                   "\n | Fecha de devolución: " + prestamo.getFechaFin());
                tienePrestamos = true;
            }
        }
    
        if (!tienePrestamos) {
            System.out.println("No tienes préstamos activos.");
        }
    }

    public void addBook(String title, String author, String isbn, boolean available, int year, String genre) {
        if (books.containsKey(isbn)) {
            System.out.println("Error: El libro ya está registrado.");
            return;
        }
        Book newBook = new Book(title, author, isbn, available, year, genre);
        books.put(isbn, newBook);
    }

    public HashMap<String, Users> getUsers() {
        return this.users;
    }

    public HashMap<String, Book> getBooks() {
        return this.books;
    }

    public boolean validateUserLoggin(String username, String password) {
        Users user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    public String getUserType(String registerUser) {
        Users user = users.get(registerUser);
        return (user != null) ? user.getTipo() : "Desconocido";
    }
}