package edu.jose.vazquez.actividades.proyectofinal.process;
import edu.jose.vazquez.actividades.proyectofinal.models.Book;
import edu.jose.vazquez.actividades.proyectofinal.models.Users;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import edu.jose.vazquez.actividades.proyectofinal.models.Prestamos;

public class Bibliotecario {
    private HashMap<String, Users> users;
    private HashMap<String, Book> books;
    private ArrayList<Prestamos> prestamos;
    private static final String USERS_FILE = "src/main/java/edu/jose/vazquez/actividades/proyectofinal/data/usuarios.txt";
    private static final String BOOKS_FILE = "src/main/java/edu/jose/vazquez/actividades/proyectofinal/data/libros.txt";
    private static final String PRESTAMOS_FILE = "src/main/java/edu/jose/vazquez/actividades/proyectofinal/data/prestamos.txt";


    public Bibliotecario() {
        this.users = new HashMap<>();
        this.books = new HashMap<>();
        this.prestamos = new ArrayList<>();
        cargarUsuarios();
        cargarLibros();
        cargarPrestamos();
        addUser("admin", "admin", 0, "admin");
        addUser("jose", "123", 25, "Jose Vazquez");
        addUser("juan", "123", 15, "Juan Perez");
        addUser("maria", "123", 10, "Maria Lopez");
        addUser ("pedro", "123", 0, "Pedro Martinez");
        addUser("luis", "123", 18, "Luis Rodriguez");
        addUser("ana", "123", 30, "Ana Garcia");
        addUser("laura", "123", 0, "Laura Hernandez");
        addUser("carlos", "123", 7, "Carlos Sanchez");
        addBook("Juego de tronos", "George R. Martin", "123", true, 1937, "Fantasia");
        addBook("El señor de los anillos", "J.R.R. Tolkien", "124", true, 1937, "Fantasia");
        addBook("Harry Potter", "J.K. Rowling", "125", true, 1937, "Fantasia");
        addBook("El principito", "Antoine de Saint-Exupéry", "126", true, 1937, "Fantasia");
        addBook("Cien años de soledad", "Gabriel García Márquez", "127", true, 1937, "Fantasia");
        addBook("Don Quijote de la Mancha", "Miguel de Cervantes", "128", true, 1937, "Fantasia");
        addBook("El alquimista", "Paulo Coelho", "129", true, 1937, "Fantasia");
        addBook("El código Da Vinci", "Dan Brown", "130", true, 1937, "Fantasia");
        addBook("El perfume", "Patrick Süskind", "131", true, 1937, "Fantasia");
        addBook("La sombra del viento", "Carlos Ruiz Zafón", "132", true, 1937, "Fantasia");
        addBook("El nombre del viento", "Patrick Rothfuss", "133", true, 1937, "Fantasia");
        addBook("La ladrona de libros", "Markus Zusak", "134", true, 1937, "Fantasia");
        addPrestamo("123", "jose");
        devolverLibro("123", "jose");
        addPrestamo("123", "laura");
        devolverLibro("123", "laura");
        addPrestamo("134", "ana");
        forzarVencimientoPrestamo("134", "ana");
        addPrestamo("123", "laura");
        devolverLibro("123", "laura");
        addPrestamo("126", "laura");
        devolverLibro("126", "laura");
        addPrestamo("126", "laura");
        devolverLibro("126", "laura");
        addPrestamo("130", "laura");
        addPrestamo("133", "luis");
        forzarVencimientoPrestamo("133", "luis");
        addPrestamo("128", "ana");
        forzarVencimientoPrestamo("128", "ana");
        addPrestamo("124", "jose");
        addPrestamo("131", "pedro");
        addPrestamo("132", "pedro");
        addPrestamo("129", "pedro");
        devolverLibro("129", "pedro");
        devolverLibro("131", "pedro");
        addPrestamo("125","juan"); 
    }

    public void actualizarPrestamos() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
    
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getStatus().equals("Prestado")) {
                try {
                    Date returnDate = dateFormat.parse(prestamo.getFechaFin());
                    if (currentDate.after(returnDate)) {
                        prestamo.setStatus("Vencido");
                        users.get(prestamo.getUsername()).setVencimientos(users.get(prestamo.getUsername()).getVencimientos() + 1);
                        books.get(prestamo.getTitle()).setAvailable(true);

                    }
                } catch (ParseException e) {
                    System.out.println("Error al procesar la fecha de vencimiento: " + e.getMessage());
                }
            }
        }
        guardarPrestamos();
        guardarUsuarios();
    }

    public void forzarVencimientoPrestamo(String isbn, String username) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1); 
        String fechaVencida = dateFormat.format(calendar.getTime());
    
        boolean encontrado = false;
    
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getUsername().equals(username) && prestamo.getTitle().equals(isbn) && prestamo.getStatus().equals("Prestado")) {
                prestamo.setFechaFin(fechaVencida);
                encontrado = true;
                break;
            }
        }
    
        if (encontrado) {
            guardarPrestamos(); 
        } else {
            System.out.println("No se encontró un préstamo activo para este libro y usuario.");
        }
    }
    public void mostrarPrestamosVencidos(){
        System.out.println("Préstamos vencidos:");
        boolean tienePrestamos = false;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getStatus().equals("Vencido")) {
                try {
                    Date returnDate = dateFormat.parse(prestamo.getFechaFin());
                    if (currentDate.after(returnDate)) {
                        String isbn = prestamo.getTitle();
                        String nombreLibro = books.containsKey(isbn) ? books.get(isbn).getTitle() : "Libro no encontrado";
                        System.out.println("\n Libro: " + nombreLibro +
                                           "\n | ISBN: " + isbn +
                                           "\n | Usuario: " + prestamo.getUsername() +
                                           "\n | Fecha de devolución: " + prestamo.getFechaFin());
                        tienePrestamos = true;
                    }
                } catch (Exception e) {
                    System.out.println("Error al comparar fechas: " + e.getMessage());
                }
            }
        }
        if (!tienePrestamos) {
            System.out.println("No hay préstamos vencidos en la biblioteca.");
        }
    }


    public void addPrestamoVencido(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getStatus().equals("Prestado")) {
                try {
                    Date returnDate = dateFormat.parse(prestamo.getFechaFin());
                    if (currentDate.after(returnDate)) {
                        String isbn = prestamo.getTitle();
                        books.get(isbn).setAvailable(true);
                        prestamo.setStatus("Vencido");
                        users.get(prestamo.getUsername()).setVencimientos(users.get(prestamo.getUsername()).getVencimientos() + 1);
                        guardarPrestamos();
                    }
                } catch (Exception e) {
                    System.out.println("Error al comparar fechas: " + e.getMessage());
                }
            }
        }
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

        Users newUser = new Users(username, password, age, name, tipo, 0, 0);
        users.put(username, newUser);
        guardarUsuarios();
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
                books.get(isbn).setPopularity(books.get(isbn).getPopularity() + 1);
                guardarPrestamos();
                guardarLibros(); 
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
                books.get(isbn).setPopularity(books.get(isbn).getPopularity() + 1);
                guardarPrestamos();
                guardarLibros(); 
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
                books.get(isbn).setPopularity(books.get(isbn).getPopularity() + 1);
                guardarPrestamos();
                guardarLibros();
                 
                return true;
        }
        return false;
    }
    
    private void guardarPrestamos(){
        File file = new File(PRESTAMOS_FILE);
        file.getParentFile().mkdirs();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PRESTAMOS_FILE))) {
            for (Prestamos prestamo : prestamos) {
                writer.write(prestamo.getTitle() + "," + prestamo.getUsername() + "," + prestamo.getFechaInicio() + "," + prestamo.getFechaFin() + "," + prestamo.getStatus());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar prestamos: " + e.getMessage());
        }
    }

    private void cargarPrestamos(){
        File file = new File(PRESTAMOS_FILE);
        if (!file.exists()) {
            System.out.println("No se encontraron datos de prestamos.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(PRESTAMOS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Prestamos prestamo = new Prestamos(parts[0], parts[1], parts[2], parts[3], parts[4]);
                    prestamos.add(prestamo);
                }
            }
        } catch (IOException e) {
            System.out.println("No se encontraron datos de prestamos.");
        }
    }
    private void guardarUsuarios() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE))) {
            for (Users user : users.values()) {
                writer.write(user.getUsername() + "," + user.getPassword() + "," + user.getAge() + "," + user.getName() + "," + user.getTipo() + "," + user.getEntregados() + "," + user.getVencimientos());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar usuarios: " + e.getMessage());
        }
    }

    private void cargarUsuarios() {
        File file = new File(USERS_FILE);
        if (!file.exists()) {
            System.out.println("No se encontraron datos de usuarios.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) { 
                    Users user = new Users(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], parts[4], Integer.parseInt(parts[5]), Integer.parseInt(parts[6]));
                    users.put(parts[0], user);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar usuarios.");
        }
    }

    private void guardarLibros() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BOOKS_FILE))) {
            for (Book book : books.values()) {
                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getIsbn() + "," + book.isAvailable() + "," + book.getYear() + "," + book.getGenre() + "," + book.getPopularity());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar libros: " + e.getMessage());
        }
    }

    public void cargarLibros() {
        File file = new File(BOOKS_FILE);
        if (!file.exists()) {
            System.out.println("No se encontraron datos de libros.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) { // Ahora incluye la popularidad
                    Book book = new Book(parts[0], parts[1], parts[2], Boolean.parseBoolean(parts[3]), Integer.parseInt(parts[4]), parts[5], Integer.parseInt(parts[6]));
                    books.put(parts[2], book);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar libros.");
        }
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
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendar = Calendar.getInstance();
                Date currentDate = calendar.getTime();
                prestamo.setFechaDevolucion(dateFormat.format(currentDate));
                users.get(username).setEntregados(users.get(username).getEntregados() + 1);
                System.out.println("Libro devuelto con éxito.");
                guardarPrestamos();
                guardarUsuarios();
                guardarLibros();
                return;
            }
        }
        System.out.println("Error: No tienes este libro prestado.");
    }



    public void mostrarUsuariosVencidos(){
        System.out.println("Usuarios con préstamos vencidos:");
        boolean tienePrestamos = false;
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getStatus().equals("Vencido")) {
                String isbn = prestamo.getTitle();
                String nombreLibro = books.containsKey(isbn) ? books.get(isbn).getTitle() : "Libro no encontrado";
                System.out.println("\n Usuario: " + prestamo.getUsername() +
                                   "\n | Libro: " + nombreLibro +
                                   "\n | ISBN: " + isbn +
                                   "\n | Fecha de devolución: " + prestamo.getFechaFin());
                tienePrestamos = true;
            }
        }
        if (!tienePrestamos) {
            System.out.println("No hay usuarios con préstamos vencidos.");
        }
    }

    public void mostrarUsuariosMasVencidos(){
        System.out.println("Usuarios con más préstamos vencidos:");
        List<Users> usuariosOrdenados = users.values().stream()
                .filter(user -> user.getVencimientos() > 0)
                .sorted(Comparator.comparing(Users::getVencimientos, Comparator.reverseOrder())
                        .thenComparing(Users::getUsername))
                .collect(Collectors.toList());
        
        if (usuariosOrdenados.isEmpty()) {
            System.out.println("No hay usuarios con préstamos vencidos.");
        } else {
            for (Users user : usuariosOrdenados) {
                System.out.println("\n Usuario: " + user.getUsername() +
                                   "\n | Nombre: " + user.getName() +
                                   "\n | Tipo: " + user.getTipo() +
                                   "\n | Préstamos vencidos: " + user.getVencimientos());
            }
        }

    }

    public void mostrarUsuariosMasEntregados(){
        System.out.println("Usuarios con más préstamos entregados:");
        List<Users> usuariosOrdenados = users.values().stream()
                .filter(user -> user.getEntregados() > 0)
                .sorted(Comparator.comparing(Users::getEntregados, Comparator.reverseOrder())
                        .thenComparing(Users::getUsername))
                .collect(Collectors.toList());
        
        if (usuariosOrdenados.isEmpty()) {
            System.out.println("No hay usuarios con préstamos entregados.");
        } else {
            for (Users user : usuariosOrdenados) {
                System.out.println("\n Usuario: " + user.getUsername() +
                                   "\n | Nombre: " + user.getName() +
                                   "\n | Tipo: " + user.getTipo() +
                                   "\n | Préstamos entregados: " + user.getEntregados());
            }
        }
    }

    public void showBooksSorted(){
        System.out.println("Libros ordenados por título:");
        List<Book> librosOrdenados = books.values().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
        
        if (librosOrdenados.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Book book : librosOrdenados) {
                System.out.println("╔═══════════════════╗");
                System.out.println("║  "+book.getTitle()+"     ║");
                System.out.println("╚═══════════════════╝");
                System.out.println("╔═══════════════════╗");
                System.out.println("║ Autor: " + book.getAuthor() );
                System.out.println("║ ISBN: " + book.getIsbn() );
                System.out.println("║ Género: " + book.getGenre() );
                System.out.println("║ Año de publicación: " + book.getYear() );
                System.out.println("║ " + (book.isAvailable() ? "Actualmente disponible" : "Actualmente prestado") );
                System.out.println("╚═══════════════════╝");
            }
        }
    }

    public void showBooksAvailableSorted(){
        System.out.println("Libros disponibles ordenados por título:");
        List<Book> librosOrdenados = books.values().stream()
                .filter(Book::isAvailable)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
        
        if (librosOrdenados.isEmpty()) {
            System.out.println("No hay libros disponibles en la biblioteca.");
        } else {
            for (Book book : librosOrdenados) {
                System.out.println("╔═══════════════════╗");
                System.out.println("║  "+book.getTitle()+"     ║");
                System.out.println("╚═══════════════════╝");
                System.out.println("╔═══════════════════╗");
                System.out.println("║ Autor: " + book.getAuthor() );
                System.out.println("║ ISBN: " + book.getIsbn() );
                System.out.println("║ Género: " + book.getGenre() );
                System.out.println("║ Año de publicación: " + book.getYear() );
                System.out.println("║ " + (book.isAvailable() ? "Actualmente disponible" : "Actualmente prestado") );
                System.out.println("╚═══════════════════╝");
            }
        }
    }
    
    public void mostrarLibrosMasPopulares() {
        cargarLibros();
        System.out.println("Libros más populares:");
        List<Book> librosOrdenados = books.values().stream()
                .filter(book -> book.getPopularity() > 0)
                .sorted(Comparator.comparing(Book::getPopularity, Comparator.reverseOrder())
                        .thenComparing(Book::getTitle))
                .collect(Collectors.toList());
        
        if (librosOrdenados.isEmpty()) {
            System.out.println("No hay libros populares en la biblioteca.");
        } else {
            for (Book book : librosOrdenados) {
                System.out.println("\n Título: " + book.getTitle() +
                                   "\n | Autor: " + book.getAuthor() +
                                   "\n | ISBN: " + book.getIsbn() +
                                   "\n | Veces que se ha prestado: " + book.getPopularity());
            }
        }
    }


    public void mostrarLibrosMenosPopulares() {
        cargarLibros();
        System.out.println("Libros menos populares:");
        List<Book> librosOrdenados = books.values().stream()
                .sorted(Comparator.comparing(Book::getPopularity)
                        .thenComparing(Book::getTitle))
                .collect(Collectors.toList());
        
        if (librosOrdenados.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Book book : librosOrdenados) {
                System.out.println("\n Título: " + book.getTitle() +
                                   "\n | Autor: " + book.getAuthor() +
                                   "\n | ISBN: " + book.getIsbn() +
                                   "\n | Veces que se ha prestado: " + book.getPopularity());
            }
        }
    }

    public void mostrarPrestamosAdministrador() {
        
        System.out.println("Préstamos del mes:");
        boolean tienePrestamos = false;
        for (Prestamos prestamo : prestamos) {
            String isbn = prestamo.getTitle();
            String nombreLibro = books.containsKey(isbn) ? books.get(isbn).getTitle() : "Libro no encontrado";
            String fechaDevolucion = prestamo.getFechaFin();
            
            if (prestamo.getStatus().equals("Devuelto")) {
                fechaDevolucion = prestamo.getFechaDevolucion(); 
            }
            if(prestamo.getStatus().equals("Vencido")){
                fechaDevolucion = prestamo.getFechaFin();
            }
            System.out.println("\n Libro: " + nombreLibro +
                               "\n | ISBN: " + isbn +
                               "\n | Usuario: " + prestamo.getUsername() +
                               "\n | Fecha de préstamo: " + prestamo.getFechaInicio() +
                               "\n | Fecha de devolución: " + fechaDevolucion);
            tienePrestamos = true;
        }
        
        if (!tienePrestamos) {
            System.out.println("No hay se han registrado prestamos en la biblioteca este mes.");
        }
    }

    public void mostrarPrestamosActivosAdministrador() {
        System.out.println("Préstamos activos:");
        boolean tienePrestamos = false;
    
        for (Prestamos prestamo : prestamos) {
            if (!prestamo.getStatus().equals("Devuelto") && !prestamo.getStatus().equals("Vencido")) { // Filtrar solo los préstamos activos
                String isbn = prestamo.getTitle();
                String nombreLibro = books.containsKey(isbn) ? books.get(isbn).getTitle() : "Libro no encontrado";
                System.out.println("\n Libro: " + nombreLibro +
                                   "\n | ISBN: " + isbn +
                                   "\n | Usuario: " + prestamo.getUsername() +
                                   "\n | Fecha de préstamo: " + prestamo.getFechaInicio() +
                                   "\n | Fecha de devolución: " + prestamo.getFechaFin());
                tienePrestamos = true;
            }
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
        Book newBook = new Book(title, author, isbn, available, year, genre, 0);
        books.put(isbn, newBook);
        guardarLibros();
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