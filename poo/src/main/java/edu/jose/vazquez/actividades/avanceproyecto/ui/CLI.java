package edu.jose.vazquez.actividades.avanceproyecto.ui;

import java.util.Scanner;

import edu.jose.vazquez.actividades.avanceproyecto.models.Book;
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
                        if (opcion < 1 || opcion > 5) {
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
                        if (userManager.validateUser( registerUser, registerPassword)) {
                            System.out.println("╔═══════════════════════════╗");
                            System.out.println("║ Bienvenido Administrador  ║");
                            System.out.println("╚═══════════════════════════╝");
                        }
                /**
                 * case 3:
                    if (storeManager.getProducts().size() < 1) {
                        System.out.println("╔═══════════════════╗");
                        System.out.println("║  Opción inválida  ║");
                        System.out.println("╚═══════════════════╝");
                        break;
                    }
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║  El catálogo actual es: ║");
                    System.out.println("╚═════════════════════════╝");
                    storeManager.getProducts().forEach(CLI::showProduct);

                    break;

                case 4:
                    if (storeManager.getProducts().size() < 2) {
                        System.out.println("╔═══════════════════╗");
                        System.out.println("║  Opción inválida  ║");
                        System.out.println("╚═══════════════════╝");
                        break;
                        
                    }
                        System.out.println("╔═════════════════════════╗");
                        System.out.println("║  Comparar productos     ║");
                        System.out.println("╚═════════════════════════╝");
                     if (storeManager.getProducts().size() > 2) {
                        System.out.println("╔════════════════════════════════════════════╗");
                        System.out.println("║  Se compararán los primeros dos productos  ║");
                        System.out.println("╚════════════════════════════════════════════╝");
                    }
                    compareProducts(storeManager.getProducts().get(0), storeManager.getProducts().get(1));
                    System.out.println(compareProducts(storeManager.getProducts().get(0), storeManager.getProducts().get(1)));
                    break;

                 */
                
                case 5:
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
        /**
         * if ( userManager.getUsers()) {
            System.out.println("╔═══════════════════════════════════════════════════════════╗");
            System.out.println("║                    MENÚ Administrador                     ║");
            System.out.println("╠═══════════════════════════════════════════════════════════╣");
            System.out.println("║     1. Consultar personas registradas en la biblioteca    ║");
            System.out.println("║     2. Ingresa nuevos libros a la biblioteca              ║");
            System.out.println("║     3. Mostrar libros en stock                            ║");
            System.out.println("║     4. Consultar prestamos actuales                       ║");
            System.out.println("║     5. Salir                                              ║");
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
            
        }
         */
        


    }
}
