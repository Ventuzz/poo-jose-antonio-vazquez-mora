package edu.jose.vazquez.actividades.actividad1.ui;

import java.util.Scanner;

public class CLI {
    public static void ShowMenu() {
        System.out.println("Bienvenido al menu");
        System.out.println("1. Mostrar registros");
        System.out.println("2. mostrar autos"); 
        System.out.println("3. salir o cerrar");
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void mostrarError(String mensaje){
        System.out.println("Error: "+ mensaje);
    }

    public void mostrarcarro(String[] carroStrings){
        for (String carro: carroStrings){
            System.out.println(carroStrings);
        }
    }

    public static void launch(){
        ShowMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        while (opcion!=3) {
            switch (opcion) {
                case 1:
                    System.out.println("agregar un nuevo auto");
                    break;
                case 2:
                    System.out.println("lista de autos");
                    break;
                default:
                    System.out.println("opción invalida");
                    break;
            }

            //logica de creación del objeto carro
            ShowMenu();
            opcion=scanner.nextInt();
        }
    }
}
