package edu.jose.vazquez.actividades.avanceproyecto.ui;

import java.util.ArrayList;
import java.util.Scanner;

import edu.jose.vazquez.actividades.avanceproyecto.models.Book;
import edu.jose.vazquez.actividades.avanceproyecto.models.Users;
import edu.jose.vazquez.actividades.avanceproyecto.process.BookManager;
import edu.jose.vazquez.actividades.avanceproyecto.process.UserManager;



public class CLI {
static BookManager bookManager = new BookManager();
static UserManager userManager = new UserManager();


            public static void runApp() {
            Scanner scanner = new Scanner(System.in);
            int opcion = -1; 
            while (opcion !=3) {
                showMenu();
                while (true) {
                    System.out.print("Seleccione una opción: ");
                    String input = scanner.nextLine().trim(); 
        
                    if (input.isEmpty()) {
                        System.out.println("╔═════════════════════════════════════════════════════╗");
                        System.out.println("║  Opción inválida, no puedes dejar la entrada vacia  ║");
                        System.out.println("╚═════════════════════════════════════════════════════╝");
                        showMenu();
                        continue;
                    }
        
                    try {
                        opcion = Integer.parseInt(input);
                        if (opcion < 1 || opcion > 3) {
                            System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
                            System.out.println("║  Opción inválida, no puedes ingresar números que no estén dentro del menú  ║");
                            System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
                            showMenu();
                        } else {
                            break; 
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("╔═══════════════════════════════════════════════════════════╗");
                        System.out.println("║  Opción inválida, por favor introduce un número del menú  ║");
                        System.out.println("╚═══════════════════════════════════════════════════════════╝");
                        showMenu();
                    }
                }
                switch (opcion) {

                    case 1:
                        System.out.println("╔═══════════════════════════════════╗");
                        System.out.println("║ Introduce tu nombre de usuario    ║");
                        System.out.println("╚═══════════════════════════════════╝");
                        String user;
                        while (true) {
                            System.out.print("Nombre de usuario: ");
                            user = scanner.nextLine().trim();
                            if (user.isEmpty()) {
                                System.out.println("╔══════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║ Ingresa un nombre de usuario valido, no puede quedarse vacio, intentalo de nuevo ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        System.out.println("╔═══════════════════════════════════╗");
                        System.out.println("║ Introduce una contraseña segura   ║");
                        System.out.println("╚═══════════════════════════════════╝");
                        String password;
                        while (true) {
                            System.out.print("Contraseña: ");
                            password = scanner.nextLine().trim();
                            if (user.isEmpty()) {
                                System.out.println("╔═══════════════════════════════════════════════════════════════╗");
                                System.out.println("║ La contraseña no puede quedarse en blanco, intentalo de nuevo ║");
                                System.out.println("╚═══════════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        userManager.addUser(user, password);
                        System.out.println("╔═════════════════════════════╗");
                        System.err.println("║  ¡Cuenta creada con exito!  ║");
                        System.out.println("╚═════════════════════════════╝");
                        UserMenu();
                        break;
   
                    case 2:
                        System.out.println("╔═════════════════════════════════╗");
                        System.out.println("║  Excelente, Ingresa tu usuario: ║");
                        System.out.println("╚═════════════════════════════════╝");
                        String registerUser;
                        while (true) {
                            System.out.print("Nombre de usuario: ");
                            registerUser = scanner.nextLine().trim();
                            if (registerUser.isEmpty()) {
                                System.out.println("╔══════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║ Ingresa un nombre de usuario valido, no puede quedarse vacio, intentalo de nuevo ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        System.out.println("╔═══════════════════════════════╗");
                        System.out.println("║ Ahora ingresa tu contraseña   ║");
                        System.out.println("╚═══════════════════════════════╝");
                        String registerPassword;
                        while (true) {
                            System.out.print("Contraseña: ");
                            registerPassword = scanner.nextLine().trim();
                            if (registerPassword.isEmpty()) {
                                System.out.println("╔═══════════════════════════════════════════════════════════════╗");
                                System.out.println("║ La contraseña no puede quedarse en blanco, intentalo de nuevo ║");
                                System.out.println("╚═══════════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        if (userManager.validateUser(registerUser, registerPassword)) {
                            if (userManager.isFirstUser(registerUser)) {
                                System.out.println("╔═══════════════════════════╗");
                                System.out.println("║ Bienvenido Administrador  ║");
                                System.out.println("╚═══════════════════════════╝");
                                AdminMenu();
                            } else {
                                System.out.println("╔═══════════════════════╗");
                                System.out.println("║  Bienvenido, "+ registerUser +".   ║");
                                System.out.println("╚═══════════════════════╝");
                                UserMenu();
                            }
                        } else {
                            System.out.println("╔═══════════════════════════╗");
                            System.out.println("║  Credenciales incorrectas ║");
                            System.out.println("╚═══════════════════════════╝");
                        }
                        break;
                    case 3:
                    System.out.println("╔══════════╗");
                    System.out.println("║  Adiós!  ║");
                    System.out.println("╚══════════╝");
                    break;
            }
        }
        



    }




    public static void showBook(Book book) {
        System.out.println("╔═══════════════════╗");
        System.out.println("║      "+book.getTitle()+"     ║");
        System.out.println("╚═══════════════════╝");
        System.out.println("╔═══════════════════╗");
        System.out.println("║ Autor: " + book.getAuthor() + "║");
        System.out.println("║ ISBN: " + book.getIsbn() + "║");
        System.out.println("║ Género: " + book.getGenre() + "║");
        System.out.println("║ Año de publicación: " + book.getYear() + "║");
        System.out.println("║ Disponibilidad: " + book.getAvailable() + " ║");
        System.out.println("╚═══════════════════╝");
    }

    public static void showUser(Users user){
        System.out.println("╔═══════════════════╗");
        System.out.println("║ Usuario: " + user.getUsername() + "   ║");
        System.out.println("║ Contraseña: " + user.getPassword() + "   ║");
        System.out.println("╚═══════════════════╝");
    }


    public static void showMenu(){
        System.out.println("╔═══════════════════════╗");
        System.out.println("║ Iniciar sesión        ║");
        System.out.println("╠═══════════════════════╣");
        System.out.println("║ No tengo una cuenta   ║");
        System.out.println("║ 1. Registrarse        ║");
        System.out.println("║                       ║");
        System.out.println("║ Ya tengo una cuenta   ║");
        System.out.println("║ 2. Iniciar sesión     ║");
        System.out.println("║                       ║");
        System.out.println("║ 3. Salir              ║");
        System.out.println("╚═══════════════════════╝");
    }

    public static void AdminMenu(){
            Scanner scanner = new Scanner(System.in);
            int option = -1;
    
            while (option != 5) {
                System.out.println("╔═══════════════════════════════════════════════════════════╗");
                System.out.println("║                    MENÚ Administrador                     ║");
                System.out.println("╠═══════════════════════════════════════════════════════════╣");
                System.out.println("║     1. Consultar personas registradas en la biblioteca    ║");
                System.out.println("║     2. Ingresar nuevos libros a la biblioteca             ║");
                System.out.println("║     3. Mostrar libros en stock                            ║");
                System.out.println("║     4. Consultar los préstamos activos                    ║");
                System.out.println("║     5. Salir                                              ║");
                System.out.println("╚═══════════════════════════════════════════════════════════╝");
    
                System.out.print("Seleccione una opción: ");
                String userInput = scanner.nextLine().trim();
    
                try {
                    option = Integer.parseInt(userInput);
                    if (option < 1 || option > 5) {
                        System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║  Opción inválida, no puedes ingresar números que no estén dentro del menú  ║");
                        System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("╔═══════════════════════════════════════════════════════════╗");
                    System.out.println("║  Opción inválida, por favor introduce un número del menú  ║");
                    System.out.println("╚═══════════════════════════════════════════════════════════╝");
                    continue;
                }
    
                switch (option) {
                    case 1:
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║ Las personas registradas en el sistema son:  ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        userManager.getUsers().forEach(CLI :: showUser);
                        break;
                    case 2:
                        System.out.println("╔══════════════════════════════╗");
                        System.out.println("║ Ingresa el titulo del libro  ║");
                        System.out.println("╚══════════════════════════════╝");
                        String title;
                        while (true) {
                            System.out.print("Titulo: ");
                            title = scanner.nextLine().trim();
                            if (title.isEmpty()) {
                                System.out.println("╔═════════════════════════════════════════════════════════╗");
                                System.out.println("║ El libro tiene que tener un nombre, Inténtalo de nuevo. ║");
                                System.out.println("╚═════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        System.out.println("╔═════════════════════════════╗");
                        System.out.println("║ Ingresa el autor del libro  ║");
                        System.out.println("╚═════════════════════════════╝");
                        String author;
                        while (true) {
                            System.out.print("Autor: ");
                            author = scanner.nextLine().trim();
                            if (author.isEmpty()) {
                                System.out.println("╔════════════════════════════════════════════════════════╗");
                                System.out.println("║ El libro tiene que tener un autor, Inténtalo de nuevo. ║");
                                System.out.println("╚════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        System.out.println("╔════════════════════════════╗");
                        System.out.println("║ Ingresa el isbn del libro  ║");
                        System.out.println("╚════════════════════════════╝");
                        String isbn;
                        while (true) {
                            System.out.print("Isbn: ");
                            isbn = scanner.nextLine().trim();
                            if (isbn.isEmpty()) {
                                System.out.println("╔══════════════════════════════════════════════════════════════╗");
                                System.out.println("║ El libro tiene que tener un código ISBN, Inténtalo de nuevo. ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        System.out.println("╔══════════════════════════════╗");
                        System.out.println("║ Ingresa el género del libro  ║");
                        System.out.println("╚══════════════════════════════╝");
                        String genre;
                        while (true) {
                            System.out.print("Género: ");
                            genre = scanner.nextLine().trim();
                            if (genre.isEmpty()) {
                                System.out.println("╔══════════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║ El libro tiene que pertenecer a un género literario, Inténtalo de nuevo. ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        System.out.println("╔══════════════════════════════════════════╗");
                        System.out.println("║ Ingresa el año de publicación del libro  ║");
                        System.out.println("╚══════════════════════════════════════════╝");
                        int year = -1;
                        while (true) {
                            try {
                                System.out.print("Año de publicación: ");
                                year = Integer.parseInt(scanner.nextLine());

                                if (year < 0) {
                                    throw new IllegalArgumentException("El año de publicación no puede ser negativo.");
                                } 
                                if (year > 2025) {
                                    throw new IllegalArgumentException("El año de publicación aún no llega. Por favor, introduce un año válido (hasta 2025).");
                                }
                                break; 

                            } catch (NumberFormatException e) {
                                System.out.println("╔══════════════════════════════════════════════════════════════╗");
                                System.out.println("║  Solo puedes ingresar números, por favor inténtalo de nuevo. ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════╝");
                            } catch (IllegalArgumentException e) {
                                System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║  " + e.getMessage() + "  ║");
                                System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════╝");
                            }
                        }
                        
                        System.out.println("╔════════════════════════════════════════╗");
                        System.out.println("║ Se ingresará el libro como disponible  ║");
                        System.out.println("╚════════════════════════════════════════╝");
                        boolean available = true;
                        bookManager.addBook(title, author, isbn, available, year, genre);
                        System.out.println("╔══════════════════════════════════════════╗");
                        System.err.println("║  ¡Libro agregado con exito al catálogo!  ║");
                        System.out.println("╚══════════════════════════════════════════╝");
                        break;

                    case 3:
                        System.out.println("╔════════════════════════════════════════════╗");
                        System.out.println("║  Este es nuestro catálogo actual de libros ║");
                        System.out.println("╚════════════════════════════════════════════╝");
                        bookManager.getBooks().forEach(CLI::showBook);
                        break;
                    case 4:
                        System.out.println("Mostrando préstamos activos...");
                        break;
                    case 5:
                        System.out.println("╔══════════════════════════════════════╗");
                        System.out.println("║  Saliendo del menú de administrador  ║");
                        System.out.println("╚══════════════════════════════════════╝");
                        break;
                }
            }
    }

    private static void lendBook(Scanner scanner, String loggedUser){
        String title = scanner.nextLine().trim();
        boolean bookFound = false;
        for(Book book: bookManager.getBooks()){
            if (book.getTitle().equalsIgnoreCase(title) && book.getAvailable()){
                book.setAvailable(false);
                userManager.lendBookToUser(loggedUser, title);
                System.out.println("libro prestado con éxito");
                bookFound =true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("el libro no esta disponible");
        }
    }

    private static void showActiveLoans(String loggedUser){
        System.out.println("estos son los libros que tienes prestados");
        ArrayList<String> borrowedBooks= userManager.getBorrowedBooks(loggedUser);
        if (borrowedBooks.isEmpty()) {
            System.out.println("No tienes prestamos activos");
        } else{
            for(String bookTitle : borrowedBooks){
                System.out.println(bookTitle);
            }
        }
        System.out.println(borrowedBooks);
    }
    
    public static void UserMenu() {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║                    MENÚ                      ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║     1. Consultar libros disponibles          ║");
        System.out.println("║     2. Solicitar el préstamo de un libro     ║");
        System.out.println("║     3. Préstamos activos                     ║");
        System.out.println("║     4. Salir                                 ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    
        Scanner scanner = new Scanner(System.in);
        int option = -1;
    
        while (option != 4) {
            System.out.print("Seleccione una opción: ");
            String userInput = scanner.nextLine().trim();
    
            if (userInput.isEmpty()) {
                System.out.println("╔═════════════════════════════════════════════════════╗");
                System.out.println("║  Opción inválida, no puedes dejar la entrada vacía  ║");
                System.out.println("╚═════════════════════════════════════════════════════╝");
                continue; 
            }
    
            try {
                option = Integer.parseInt(userInput);
                if (option < 1 || option > 4) {
                    System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║  Opción inválida, no puedes ingresar números que no estén dentro del menú  ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("╔═══════════════════════════════════════════════════════════╗");
                System.out.println("║  Opción inválida, por favor introduce un número del menú  ║");
                System.out.println("╚═══════════════════════════════════════════════════════════╝");
                continue;
            }
    
            switch (option) {
                case 1:
                    System.out.println("╔════════════════════════════════════════════╗");
                    System.out.println("║  Este es nuestro catálogo actual de libros ║");
                    System.out.println("╚════════════════════════════════════════════╝");
                    ArrayList<Book> books = bookManager.getBooks();
                    for (Book book : books) {
                        if (book.getAvailable()) {
                                showBook(book);
                        }
                    }

                    break;
                case 2:
                    System.out.println("╔═════════════════════════════════════════════════════════╗");
                    System.out.println("║  Ingresa el nombre del libro que quieres pedir prestado ║");
                    System.out.println("╚═════════════════════════════════════════════════════════╝");
                    lendBook(scanner, userInput);
                    break;
                case 3:
                    System.out.println("╔════════════════════════════════════════════════╗");
                    System.out.println("║  Estos son los libros que has pedido prestados ║");
                    System.out.println("╚════════════════════════════════════════════════╝");
                    showActiveLoans(userInput);
                    break;
                case 4:
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║  Saliendo de tu cuenta  ║");
                    System.out.println("╚═════════════════════════╝");
                    break;
            }
            if (option != 4) {
                System.out.println("\nPresiona ENTER para volver al menú...");
                scanner.nextLine(); 
                System.out.println("╔══════════════════════════════════════════════╗");
                System.out.println("║                    MENÚ                      ║");
                System.out.println("╠══════════════════════════════════════════════╣");
                System.out.println("║     1. Consultar libros disponibles          ║");
                System.out.println("║     2. Solicitar el préstamo de un libro     ║");
                System.out.println("║     3. Préstamos activos                     ║");
                System.out.println("║     4. Salir                                 ║");
                System.out.println("╚══════════════════════════════════════════════╝");
            }
        }
    }
}
