package edu.jose.vazquez.actividades.avanceproyecto.ui;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import edu.jose.vazquez.actividades.avanceproyecto.lang.Eng;
import edu.jose.vazquez.actividades.avanceproyecto.lang.Esp;
import edu.jose.vazquez.actividades.avanceproyecto.lang.Jap;
import edu.jose.vazquez.actividades.avanceproyecto.lang.Lang;
import edu.jose.vazquez.actividades.avanceproyecto.models.Book;
import edu.jose.vazquez.actividades.avanceproyecto.models.Users;
import edu.jose.vazquez.actividades.avanceproyecto.process.BookManager;
import edu.jose.vazquez.actividades.avanceproyecto.process.UserManager;

/**    
 * Esta clase es la encargada de manejar la interfaz de usuario de la aplicación   
 */
public class CLI {
static BookManager bookManager = new BookManager();
static UserManager userManager = new UserManager();
static Lang lang =new Lang();

    /**
     * Método que se encarga de asignar el lenguaje con el que el usuario quiere correr la aplicación
     */
    public static void selectLang(){
        cleanScreen();
        Locale systemLocale = Locale.getDefault();
        lang =new Esp();
        Scanner scanner=new Scanner(System.in);
        int opcion=-1;
        while (opcion!=3) {
            System.out.println("\n╔══════════════════════════════════════════════╗\n║ El idioma actual de tu ordenador es: "+ systemLocale + "   ║\n║      ¿Te gustaría cambiar el idioma?         ║\n╠══════════════════════════════════════════════╣\n║                  1. Español                  ║\n║                  2. Ingles                   ║\n║                  3. Japones                  ║\n╚══════════════════════════════════════════════╝");
            while (true) {
                System.out.print(lang.select_an_option);
                String input = scanner.nextLine().trim(); 
                if (input.isEmpty()) {
                    System.out.println(lang.invalid_input_empty);
                    continue;
                }
    
                try {
                    opcion = Integer.parseInt(input);
                    if (opcion < 1 || opcion > 3) {
                        System.out.println(lang.invalid_option);
                        System.out.println("\n╔══════════════════════════════════════════════╗\n║ El idioma actual de tu ordenador es: "+ systemLocale + "   ║\n║      ¿Te gustaría cambiar el idioma?         ║\n╠══════════════════════════════════════════════╣\n║                  1. Español                  ║\n║                  2. Ingles                   ║\n║                  3. Japones                  ║\n╚══════════════════════════════════════════════╝");
                    } else {
                        break; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.invalid_input_not_number);
                    System.out.println("\n╔══════════════════════════════════════════════╗\n║ El idioma actual de tu ordenador es: "+ systemLocale + "   ║\n║      ¿Te gustaría cambiar el idioma?         ║\n╠══════════════════════════════════════════════╣\n║                  1. Español                  ║\n║                  2. Ingles                   ║\n║                  3. Japones                  ║\n╚══════════════════════════════════════════════╝");
                }
            }
            switch (opcion) {
                case 1:
                    cleanScreen();
                    lang= new Esp();
                    break;

                case 2:
                    cleanScreen();
                    lang= new Eng();
                    break;
                case 3:
                    try {
                    new ProcessBuilder("cmd", "/c", "chcp 65001").inheritIO().start().waitFor();
                    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                    cleanScreen();
                    lang= new Jap();
                    break;
            }
            break;
        }
        
    }
            /**
             * Método que se encarga de correr la aplicación
             */

            public static void runApp() {
            Scanner scanner = new Scanner(System.in);
            int opcion = -1; 
            while (opcion !=3) {
                showMenu();
                while (true) {
                    System.out.print(lang.select_an_option);
                    String input = scanner.nextLine().trim(); 
        
                    if (input.isEmpty()) {
                        System.out.println(lang.invalid_input_empty);
                        showMenu();
                        continue;
                    }
        
                    try {
                        opcion = Integer.parseInt(input);
                        if (opcion < 1 || opcion > 3) {
                            System.out.println(lang.invalid_option);

                            showMenu();
                        } else {
                            break; 
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(lang.invalid_input_not_number);

                        showMenu();
                    }
                }
                switch (opcion) {
                    /**
                     * Opción para registrarse en la aplicación
                     * @return void
                     */ 
                    case 1:
                        System.out.println(lang.register_user);

                        String user;
                        while (true) {
                            System.out.print(lang.username);
                            user = scanner.nextLine().trim();
                            if (user.isEmpty()) {
                                System.out.println(lang.invalid_new_username);

                            } else {
                                break;
                            }
                        }
                        System.out.println(lang.register_password);

                        String password;
                        while (true) {
                            System.out.print(lang.password);
                            password = scanner.nextLine().trim();
                            if (password.isEmpty()) {          
                                System.out.println(lang.invalid_new_password);

                            } else {
                                break;
                            }
                        }
                        userManager.addUser(user, password);
                        System.out.println(lang.registration_success);

                        UserMenu();
                        break;
                    /**
                    * Opción para iniciar sesión en la aplicación
                    * @return void
                    */
                    case 2:
                        System.out.println(lang.username_prompt);

                        String registerUser;
                        while (true) {
                            System.out.print(lang.username);
                            registerUser = scanner.nextLine().trim();
                            if (registerUser.isEmpty()) {
                                System.out.println(lang.invalid_new_username);

                            } else {
                                break;
                            }
                        }
                        System.out.println(lang.password_prompt);

                        String registerPassword;
                        while (true) {
                            System.out.print(lang.password);
                            registerPassword = scanner.nextLine().trim();
                            if (registerPassword.isEmpty()) {
                                System.out.println(lang.invalid_new_password);
                            } else {
                                break;
                            }
                        }
                        if (userManager.validateUser(registerUser, registerPassword)) {
                            if (userManager.isFirstUser(registerUser)) {
                                System.out.println(lang.welcome_admin);
                                AdminMenu();
                            } else {
                                System.out.println(lang.welcome_user + registerUser + lang.welcome_user_format);
                                UserMenu();
                            }
                        } else {
                            System.out.println(lang.invalid_credentials);
                        }
                        break;
                    /**
                    * Opción para salir de la aplicación
                    * @return void
                    */
                    case 3:
                    System.out.println(lang.goodbye);

                    break;
            }
        }
        



    }
    /**
     * Metodo que se encarga de limpiar la consola
     */
    public static void cleanScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error al limpiar la consola.");
        }
    }
    /**
    * Método que se encarga de mostrar la información de un libro  
    * @param book
    * @return void
    */
    
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
    /**
    * Método que se encarga de mostrar la información de un usuario
    * @param user
    * @return void
    */
    public static void showUser(Users user){
        System.out.println("╔═══════════════════╗");
        System.out.println("║ Usuario: " + user.getUsername() + "   ║");
        System.out.println("║ Contraseña: " + user.getPassword() + "   ║");
        System.out.println("╚═══════════════════╝");
    }

    /**
    * Método que se encarga de mostrar el menú principal de la aplicación
    * @return void
    */
    public static void showMenu(){
        System.out.println(lang.menu_login);
    }
        /**
         * Método que se encarga de mostrar el menú de usuario
         * @return void
         */  
    public static void AdminMenu(){
            Scanner scanner = new Scanner(System.in);
            int option = -1;
    
            while (option != 5) {
                System.out.println(lang.menu_admin);

    
                System.out.print(lang.select_an_option);
                String userInput = scanner.nextLine().trim();
    
                try {
                    option = Integer.parseInt(userInput);
                    if (option < 1 || option > 5) {
                        System.out.println(lang.invalid_option);
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.invalid_input_not_number);
                    continue;
                }
    
                switch (option) {
                    /**
                    * Opción para mostrar las personas registradas en el sistema
                    * @return void
                    */
                    case 1:
                        System.out.println(lang.registered_people);
                        userManager.getUsers().forEach(CLI :: showUser);
                        break;
                    /**
                    * Opción para agregar un libro al catálogo
                    * @return void
                    */
                    case 2:
                        System.out.println(lang.enter_book_title_prompt);
                        String title;
                        while (true) {
                            System.out.print(lang.title);
                            title = scanner.nextLine().trim();
                            if (title.isEmpty()) {
                                System.out.println(lang.invalid_title);
                            } else {
                                break;
                            }
                        }
                        System.out.println(lang.enter_book_author_prompt);
                        String author;
                        while (true) {
                            System.out.print(lang.author);
                            author = scanner.nextLine().trim();
                            if (author.isEmpty()) {
                                System.out.println(lang.invalid_author);
                            } else {
                                break;
                            }
                        }
                        System.out.println(lang.enter_book_isbn_prompt);
                        String isbn;
                        while (true) {
                            System.out.print(lang.isbn);
                            isbn = scanner.nextLine().trim();
                            if (isbn.isEmpty()) {
                                System.out.println(lang.invalid_isbn);
                            } else {
                                break;
                            }
                        }
                        System.out.println(lang.enter_book_genre_prompt);
                        String genre;
                        while (true) {
                            System.out.print(lang.genre);
                            genre = scanner.nextLine().trim();
                            if (genre.isEmpty()) {
                                System.out.println(lang.invalid_genre);
                            } else {
                                break;
                            }
                        }
                        System.out.println(lang.enter_book_year_prompt);
                        int year = -1;
                        while (true) {
                            try {
                                System.out.print(lang.year_book);
                                year = Integer.parseInt(scanner.nextLine());

                                if (year < 0) {
                                    throw new IllegalArgumentException(lang.year_of_publication_negative_error);
                                } 
                                if (year > 2025) {
                                    throw new IllegalArgumentException(lang.year_of_publication_future_error);
                                }
                                break; 

                            } catch (NumberFormatException e) {
                                System.out.println(lang.invalid_input_not_number);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage() );
                            }
                        }
                        
                        System.out.println(lang.book_entry_success);
                        boolean available = true;
                        bookManager.addBook(title, author, isbn, available, year, genre);
                        System.out.println(lang.book_added);
                        break;
                    /**
                    * Opción para mostrar los libros disponibles en el catálogo
                    * @return void
                    */
                    case 3:
                        System.out.println(lang.show_books_in_catalog_message);
                        bookManager.getBooks().forEach(CLI::showBook);
                        break;
                    /**
                    * Opción para mostrar los préstamos activos
                    * @return void
                    */
                    case 4:
                        System.out.println(lang.show_active_loans);
                        break;
                    /**
                    * Opción para salir del menú de administrador
                    * @return void
                    */
                    case 5:
                        System.out.println(lang.exit_admin);
                        break;
                }
            }
    }
    /**
    * Método que se encarga de prestar un libro a un usuario           
    * @param scanner
    * @param loggedUser
    */
    private static void lendBook(Scanner scanner, String loggedUser){
        String title = scanner.nextLine().trim();
        boolean bookFound = false;
        for(Book book: bookManager.getBooks()){
            if (book.getTitle().equalsIgnoreCase(title) && book.getAvailable()){
                book.setAvailable(false);
                userManager.lendBookToUser(loggedUser, title);
                System.out.println(lang.book_borrow_success);
                bookFound =true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println(lang.book_not_available);
        }
    }
    /**
    * Método que se encarga de mostrar los libros que tiene un usuario prestados
    * @param loggedUser
    * @return void
    */
    private static void showActiveLoans(String loggedUser){
        System.out.println(lang.no_active_loans_message);
        ArrayList<String> borrowedBooks= userManager.getBorrowedBooks(loggedUser);
        if (borrowedBooks.isEmpty()) {
            System.out.println(lang.no_books_borrowed_message);
        } else{
            for(String bookTitle : borrowedBooks){
                System.out.println(bookTitle);
            }
        }
        System.out.println(borrowedBooks);
    }
    /**
    * Método que se encarga de mostrar el menú de usuario
    * @return void
    */
    public static void UserMenu() {
        System.out.println(lang.menu_user);
    
        Scanner scanner = new Scanner(System.in);
        int option = -1;
    
        while (option != 4) {
            System.out.print(lang.select_an_option);
            String userInput = scanner.nextLine().trim();
    
            if (userInput.isEmpty()) {
                System.out.println(lang.invalid_input_empty);
                continue; 
            }
    
            try {
                option = Integer.parseInt(userInput);
                if (option < 1 || option > 4) {
                    System.out.println(lang.invalid_option);
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println(lang.invalid_input_not_number);
                continue;
            }
    
            switch (option) {
                /**
                * Opción para mostrar los libros disponibles en el catálogo
                * @return void
                */
                case 1:
                    System.out.println(lang.show_books_in_catalog_message);
                    ArrayList<Book> books = bookManager.getBooks();
                    for (Book book : books) {
                        if (book.getAvailable()) {
                                showBook(book);
                        }
                    }

                    break;
                /**
                * Opción para solicitar el préstamo de un libro
                * @return void
                */
                case 2:
                    System.out.println(lang.book_borrow_name_prompt);
                    lendBook(scanner, userInput);
                    break;
                /**
                * Opción para mostrar los préstamos activos
                * @return void
                */
                case 3:
                    showActiveLoans(userInput);
                    break;
                /**
                * Opción para salir del menú de usuario
                * @return void
                */
                case 4:
                    System.out.println(lang.singning_out);
                    break;
            }
            if (option != 4) {
                System.out.println(lang.return_to_menu);
                scanner.nextLine(); 
                System.out.println(lang.menu_user);
            }
        }
    }
}
