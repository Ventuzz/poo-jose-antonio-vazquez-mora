package edu.jose.vazquez.actividades.actividad1.ui;

import java.util.Scanner;

import edu.jose.vazquez.actividades.actividad1.process.StockManager;

public class CLI {
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        ShowMenu();
        int opcion = scanner.nextInt();scanner.nextLine();
        
        while (opcion !=3) {
            switch (opcion) {
                case 1:
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
                    break;
                case 2:
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║  El catalogo actual es: ║");
                    System.out.println("╚═════════════════════════╝");
                    stockManager.getStock().forEach(System.out::println);
                    break;
                default:
                    System.out.println("╔═══════════════════╗");
                    System.out.println("║  Opción inválida  ║");
                    System.out.println("╚═══════════════════╝");
                    break;
            }
            ShowMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public static void ShowMenu(){
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
