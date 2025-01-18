package edu.jose.vazquez.actividades.actividad1.ui;

import java.util.Scanner;

import edu.jose.vazquez.actividades.actividad1.process.StockManager;

/**
 * Clase que proporciona una interfaz de línea de comandos (CLI) para gestionar un stock de carros.
 * Permite agregar carros al inventario y visualizar el catálogo actual.
 */

public class CLI {
    
    /**
     * Método principal que ejecuta la aplicación y gestiona la interacción con el usuario.
     */

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        showMenu();
        int opcion = scanner.nextInt();scanner.nextLine();    //lee la opción que ingresa el usuario en la terminal
        
        while (opcion !=3) {
            switch (opcion) {
                case 1:
                    //agrega un carro al stock
                    System.out.println("╔═══════════════════╗");
                    System.out.println("║Introduce la placa ║");
                    System.out.println("╚═══════════════════╝");
                    String placa = scanner.nextLine();
                    System.out.println("╔═════════════════════╗");
                    System.out.println("║ Introduce el modelo ║");
                    System.out.println("╚═════════════════════╝");
                    String modelo = scanner.nextLine();
                    System.out.println("╔════════════════════╗");
                    System.out.println("║ Introduce la marca ║");
                    System.out.println("╚════════════════════╝");
                    String marca = scanner.nextLine();
                    System.out.println("╔════════════════════╗");
                    System.out.println("║ Introduce el color ║");
                    System.out.println("╚════════════════════╝");
                    String color = scanner.nextLine();

                    stockManager.addCarro(modelo, marca, placa, color);
                    System.out.println("╔════════════════════════════╗");
                    System.err.println("║  Carro agregado con exito  ║");
                    System.out.println("╚════════════════════════════╝");
                    break;
                case 2:
                    //muestra el stock actual
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║  El catalogo actual es: ║");
                    System.out.println("╚═════════════════════════╝");
                    stockManager.getStock().forEach(System.out::println);
                    break;
                default:
                    //Cuando se ingresa una opción no valida del menú se muestra un mensaje de error
                    System.out.println("╔═══════════════════╗");
                    System.out.println("║  Opción inválida  ║");
                    System.out.println("╚═══════════════════╝");
                    break;
            }
            //vuelve a mostrar el menú
            showMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
        }
        //cuando se selecciona la opción 3 se muestra un mensaje de despedida
        System.out.println("╔══════════╗");
        System.out.println("║  Adiós!  ║");
        System.out.println("╚══════════╝");


    }
        /**
        * Muestra el menú principal en la consola.
         */
    public static void showMenu(){
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║              MENÚ              ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║        1. Agregar carro        ║");
        System.out.println("║        2. Ver stock            ║");
        System.out.println("║        3. Salir                ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.print("Seleccione una opción: ");

    }
}
