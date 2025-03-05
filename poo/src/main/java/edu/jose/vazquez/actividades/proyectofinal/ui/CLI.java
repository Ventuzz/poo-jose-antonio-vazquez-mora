package edu.jose.vazquez.actividades.proyectofinal.ui;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
import edu.jose.vazquez.actividades.proyectofinal.lang.Eng;
import edu.jose.vazquez.actividades.proyectofinal.lang.Esp;
import edu.jose.vazquez.actividades.proyectofinal.lang.Jap;
import edu.jose.vazquez.actividades.proyectofinal.lang.Lang;
import edu.jose.vazquez.actividades.proyectofinal.models.Book;
import edu.jose.vazquez.actividades.proyectofinal.models.Users;
import edu.jose.vazquez.actividades.proyectofinal.process.Bibliotecario;

/**    
 * Esta clase es la encargada de manejar la interfaz de usuario de la aplicación   
 */
public class CLI {
    static Bibliotecario bibliotecario = new Bibliotecario();
    static Lang lang =new Lang();
    static String usernameLogged;
    
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
                        try {
                        new ProcessBuilder("cmd", "/c", "chcp 65001").inheritIO().start().waitFor();
                        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
                        } catch (IOException | InterruptedException e) {
                            e.printStackTrace();
                        }
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
                            System.out.println("Ingrese su edad");
                            int age;
                            while (true) {
                                try {
                                    System.out.print("Edad: ");
                                    age = Integer.parseInt(scanner.nextLine());
                                    if (age < 0) {
                                        throw new IllegalArgumentException("La edad no puede ser negativa");
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Ingrese un número válido");
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            System.out.println("Ingrese su nombre real");
                            String name;
                            while (true) {
                                System.out.print("Nombre: ");
                                name = scanner.nextLine().trim();
                                if (name.isEmpty()) {
                                    System.out.println("Ingrese un nombre válido");
                                } else {
                                    break;
                                }
                            }
                            bibliotecario.addUser(user, password, age, name);
                            System.out.println(lang.registration_success);
                            usernameLogged = user;
                            if (bibliotecario.getUsers().get(user).getTipo().equals("Usuario VIP")) {
                                cleanScreen();
                                userMenuVip();
                            } else if (bibliotecario.getUsers().get(user).getTipo().equals("Usuario JR")) {
                                cleanScreen();
                                userMenuJr();
                            } else if (bibliotecario.getUsers().get(user).getTipo().equals("Usuario teens")) {
                                cleanScreen();
                                userMenuTeens();
                            } else{
                                cleanScreen();
                                userMenu();
                            }
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
                            if (bibliotecario.validateUserLoggin(registerUser, registerPassword)) {
                                if (registerUser.equals("admin")) {
                                    System.out.println(lang.welcome_admin);
                                    adminMenu();
                                } else {
                                    System.out.println(lang.welcome_user + registerUser + lang.welcome_user_format);
                                    usernameLogged = registerUser;


                                    if (bibliotecario.getUsers().get(registerUser).getTipo().equals("Usuario VIP")) {
                                        cleanScreen();
                                        userMenuVip();
                                    } else if (bibliotecario.getUsers().get(registerUser).getTipo().equals("Usuario JR")) {
                                        cleanScreen();
                                        userMenuJr();
                                    } else if (bibliotecario.getUsers().get(registerUser).getTipo().equals("Usuario teens")) {
                                        cleanScreen();
                                        userMenuTeens();
                                    } else{
                                        cleanScreen();
                                        userMenu();
                                    }
                                    
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
                        cleanScreen();
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
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
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
            System.out.println("║ Edad: " + user.getAge() + "   ║");
            System.out.println("║ Nombre: " + user.getName() + "   ║");
            System.out.println("║ Tipo de usuario: " + user.getTipo() + "   ║");
            System.out.println("╚═══════════════════╝");
        }
    
        /**
        * Método que se encarga de mostrar el menú principal de la aplicación
        * @return void
        */
        public static void showMenu(){
            System.out.println(lang.menu_login);
        }

        public static void showMenuJr(){
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║             Menú JR           ║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println("║ 1. Ver libros disponibles     ║");
            System.out.println("║ 2. Salir                      ║");
            System.out.println("╚═══════════════════════════════╝");
        }

        public static void showMenuTeens(){
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║               Menú Teens              ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println("║ 1. Ver libros disponibles             ║");
            System.out.println("║ 2. Solicitar préstamo de un libro     ║");
            System.out.println("║ 3. Préstamos activos                  ║");
            System.out.println("║ 4. Devolver un libro                  ║");
            System.out.println("║ 5. Salir                              ║");
            System.out.println("╚═══════════════════════════════════════╝");
        }

        public static void showMenuVip(){
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║               Menú VIP                ║");
            System.out.println("╠═══════════════════════════════════════╣");
            System.out.println("║ 1. Ver libros disponibles             ║");
            System.out.println("║ 2. Solicitar préstamo de un libro     ║");
            System.out.println("║ 3. Préstamos activos                  ║");
            System.out.println("║ 4. Devolver un libro                  ║");
            System.out.println("║ 5. Salir                              ║");
            System.out.println("╚═══════════════════════════════════════╝");
        }

        public static void showAdminMenuAdvance(){
        System.out.println(lang.menu_admin_advance);
        }
        
            /**
             * Método que se encarga de mostrar el menú de usuario
             * @return void
             */  
        public static void adminMenu(){
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
                        * Opción para agregar un libro al catálogo
                        * @return void
                        */
                        case 1:
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
                            if (bibliotecario.getBooks().containsKey(isbn)) {
                                System.out.println("El libro no se puede agregar porque tiene el mismo código único");
                                break;
                            }else{
                                bibliotecario.addBook(title, author, isbn, available, year, genre);
                                System.out.println(lang.book_added);
                            }
                            
                            break;
                        /**
                        * Opción para mostrar los libros disponibles en el catálogo
                        * @return void
                        */
                        /**
                        * Opción para mostrar los préstamos activos
                        * @return void
                        */
                        case 2:
                            bibliotecario.actualizarPrestamos();
                            bibliotecario.addPrestamoVencido();
                            System.out.println("Se han actualizado los préstamos");
                            break;
                        case 3:
                            bibliotecario.mostrarPrestamosActivosAdministrador();
                            break;
                        /**
                        * Opción para salir del menú de administrador
                        * @return void
                        */
                        case 4:
                            adminAdvanceMenu();                       
                            break;
                        case 5:
                            System.out.println(lang.exit_admin);
                            break; 
                    }
                }
        }
        public static void adminAdvanceMenu(){
            Scanner scanner = new Scanner(System.in);
            int option = -1;
            while (option != 10) {
                showAdminMenuAdvance();
                System.out.print(lang.select_an_option);
                String userInput = scanner.nextLine().trim();
    
                try {
                    option = Integer.parseInt(userInput);
                    if (option < 1 || option > 10) {
                        System.out.println(lang.invalid_option);
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(lang.invalid_input_not_number);
                    continue;
                }
    
                switch (option) {
                    
                    case 1:
                    System.out.println(lang.registered_people);
                    bibliotecario.getUsers().forEach((k, v) -> { showUser(v); });
                    break;
                    case 2:
                    System.out.println(lang.show_books_in_catalog_message);
                    bibliotecario.showBooksSorted();
                    break;
                    case 3:
                    bibliotecario.mostrarPrestamosAdministrador();
                    break;
                    case 4:
                    bibliotecario.mostrarLibrosMasPopulares();
                    break;
                    case 5:
                    bibliotecario.mostrarLibrosMenosPopulares();
                    break;
                    case 6:
                    bibliotecario.mostrarPrestamosVencidos();
                    break;
                    case 7:
                    bibliotecario.mostrarUsuariosVencidos();
                            break;
                    case 8:
                    bibliotecario.mostrarUsuariosMasVencidos();
                            break;
                    case 9:
                    bibliotecario.mostrarUsuariosMasEntregados();
                            break;
                    case 10:
                    System.out.println(lang.exit_admin);
                    break;
                }
            }     
        }
        /**
        * Método que se encarga de mostrar el menú de usuario
        * @return void
        */
        public static void userMenu() {
            System.out.println(lang.menu_user);
        
            Scanner scanner = new Scanner(System.in);
            int option = -1;
        
            while (option != 5) {
                System.out.print(lang.select_an_option);
                String userInput = scanner.nextLine().trim();
        
                if (userInput.isEmpty()) {
                    System.out.println(lang.invalid_input_empty);
                    continue; 
                }
        
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
                    * Opción para mostrar los libros disponibles en el catálogo
                    * @return void
                    */
                    case 1:
                        System.out.println(lang.show_books_in_catalog_message);
                        bibliotecario.showBooksAvailableSorted();
                        break;

                    /**
                    * Opción para solicitar el préstamo de un libro
                    * @return void
                    */
                    case 2:
                        System.out.println(lang.book_borrow_name_prompt);
                        String bookName;
                        while (true) {
                            System.out.print(lang.isbn);
                            bookName = scanner.nextLine().trim();
                            if (bookName.isEmpty()) {
                                System.out.println(lang.invalid_title);
                            } else {
                                break;
                            }
                        }
                        if (bibliotecario.addPrestamo(bookName, usernameLogged)) {
                            System.out.println("Préstamo realizado con éxito ");
                            System.out.println("El libro se ha prestado por 7 días por ser un adulto, recuerda devolverlo a tiempo");
                        } 
                        break;
                    /**
                    * Opción para mostrar los préstamos activos
                    * @return void
                    */
                    case 3:
                        bibliotecario.mostrarPrestamosActivos(usernameLogged);
                        break;
                    /**
                    * Opción para salir del menú de usuario
                    * @return void
                    */
                    case 4:
                        System.out.println("Devolver libro");
                        System.out.println("Ingrese el ISBN del libro que desea devolver");
                        String isbn;
                        while (true) {
                            System.out.print("ISBN: ");
                            isbn = scanner.nextLine().trim();
                            if (isbn.isEmpty()) {
                                System.out.println("Ingrese un ISBN válido");
                            } else {
                                break;
                            }
                        }
                        bibliotecario.devolverLibro(isbn, usernameLogged);
                        break;
                    case 5:
                        System.out.println(lang.singning_out);
                        break;
                }
                if (option != 5) {
                    System.out.println(lang.return_to_menu);
                    scanner.nextLine(); 
                    System.out.println(lang.menu_user);
                }
            }
        }

        public static void userMenuJr(){
            showMenuJr();
        
            Scanner scanner = new Scanner(System.in);
            int option = -1;
        
            while (option != 2) {
                System.out.print(lang.select_an_option);
                String userInput = scanner.nextLine().trim();
        
                if (userInput.isEmpty()) {
                    System.out.println(lang.invalid_input_empty);
                    continue; 
                }
        
                try {
                    option = Integer.parseInt(userInput);
                    if (option < 1 || option > 2) {
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
                        bibliotecario.showBooksAvailableSorted();
                        break;
                    /**
                    * Opción para salir del menú de usuario
                    * @return void
                    */
                    case 2:
                        System.out.println(lang.singning_out);
                        break;
                }
                if (option != 2) {
                    System.out.println(lang.return_to_menu);
                    scanner.nextLine(); 
                    showMenuJr();
                }
            }
        }

        public static void userMenuTeens(){
            showMenuTeens();
            Scanner scanner = new Scanner(System.in);
            int option = -1;
        
            while (option != 5) {
                System.out.print(lang.select_an_option);
                String userInput = scanner.nextLine().trim();
        
                if (userInput.isEmpty()) {
                    System.out.println(lang.invalid_input_empty);
                    continue; 
                }
        
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
                    * Opción para mostrar los libros disponibles en el catálogo
                    * @return void
                    */
                    case 1:
                        System.out.println(lang.show_books_in_catalog_message);
                        bibliotecario.showBooksAvailableSorted();
                        break;

                    /**
                    * Opción para solicitar el préstamo de un libro
                    * @return void
                    */
                    case 2:
                        System.out.println(lang.book_borrow_name_prompt);
                        String bookName;
                        while (true) {
                            System.out.print(lang.isbn);
                            bookName = scanner.nextLine().trim();
                            if (bookName.isEmpty()) {
                                System.out.println(lang.invalid_title);
                            } else {
                                break;
                            }
                        }
                        if (bibliotecario.addPrestamo(bookName, usernameLogged)) {
                            System.out.println("Préstamo realizado con éxito");
                            System.out.println("El libro se ha prestado por 7 días por ser usuario teens, recuerda devolverlo a tiempo");
                        } 
                        break;
                    /**
                    * Opción para mostrar los préstamos activos
                    * @return void
                    */
                    case 3:
                        bibliotecario.mostrarPrestamosActivos(usernameLogged);
                        break;
                    /**
                    * Opción para salir del menú de usuario
                    * @return void
                    */
                    case 4:
                        System.out.println("Devolver libro");
                        System.out.println("Ingrese el ISBN del libro que desea devolver");
                        String isbn;
                        while (true) {
                            System.out.print("ISBN: ");
                            isbn = scanner.nextLine().trim();
                            if (isbn.isEmpty()) {
                                System.out.println("Ingrese un ISBN válido");
                            } else {
                                break;
                            }
                        }
                        bibliotecario.devolverLibro(isbn, usernameLogged);
                        break;
                    case 5:
                        System.out.println(lang.singning_out);
                        break;
                }
                if (option != 5) {
                    System.out.println(lang.return_to_menu);
                    scanner.nextLine(); 
                    showMenuTeens();
                }
            }
        }

        public static void userMenuVip() {
            showMenuVip();
        
            Scanner scanner = new Scanner(System.in);
            int option = -1;
        
            while (option != 5) {
                System.out.print(lang.select_an_option);
                String userInput = scanner.nextLine().trim();
        
                if (userInput.isEmpty()) {
                    System.out.println(lang.invalid_input_empty);
                    continue; 
                }
        
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
                    * Opción para mostrar los libros disponibles en el catálogo
                    * @return void
                    */
                    case 1:
                        System.out.println(lang.show_books_in_catalog_message);
                        bibliotecario.showBooksAvailableSorted();
                        break;

                    /**
                    * Opción para solicitar el préstamo de un libro
                    * @return void
                    */
                    case 2:
                        System.out.println(lang.book_borrow_name_prompt);
                        String bookName;
                        while (true) {
                            System.out.print(lang.isbn);
                            bookName = scanner.nextLine().trim();
                            if (bookName.isEmpty()) {
                                System.out.println(lang.invalid_title);
                            } else {
                                break;
                            }
                        }
                        if (bibliotecario.addPrestamo(bookName, usernameLogged)) {
                            System.out.println("Préstamo realizado con éxito");
                            System.out.println("El libro se ha prestado por 14 días por ser usuario VIP, recuerda devolverlo a tiempo");
                        } 
                        break;
                    /**
                    * Opción para mostrar los préstamos activos
                    * @return void
                    */
                    case 3:
                        bibliotecario.mostrarPrestamosActivos(usernameLogged);
                        break;
                    /**
                    * Opción para salir del menú de usuario
                    * @return void
                    */
                    case 4:
                        System.out.println("Devolver libro");
                        System.out.println("Ingrese el ISBN del libro que desea devolver");
                        String isbn;
                        while (true) {
                            System.out.print("ISBN: ");
                            isbn = scanner.nextLine().trim();
                            if (isbn.isEmpty()) {
                                System.out.println("Ingrese un ISBN válido");
                            } else {
                                break;
                            }
                        }
                        bibliotecario.devolverLibro(isbn, usernameLogged);
                        break;
                    case 5:
                        System.out.println(lang.singning_out);
                        break;
                }
                if (option != 5) {
                    System.out.println(lang.return_to_menu);
                    scanner.nextLine(); 
                    showMenuVip();
                }
            }
        }
    }