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
                    System.out.println("Introduce el número de puertas");
                    int numPuertas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce el modelo");
                    String modelo = scanner.nextLine();
                    System.out.println("Introduce la marca");
                    String marca = scanner.nextLine();
                    System.out.println("Introduce el color");
                    String color = scanner.nextLine();
                    stockManager.addCarro(modelo, marca, numPuertas, color);
                    break;
                case 2:
                    stockManager.printStock();
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            ShowMenu();
            opcion = scanner.nextInt();
        }
    }

    public static void ShowMenu(){
        System.out.println("""
                Menu
                1.- Agregar carro
                2.- Ver stock
                3.- Salir
                """);
    }
}
