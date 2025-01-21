package edu.jose.vazquez.actividades.actividad2.ui;

import java.util.Scanner;
import edu.jose.vazquez.actividades.actividad2.process.NameValidator;
import edu.jose.vazquez.actividades.actividad2.models.Number;

public class CLI {
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        int[] numerosPares = Number.generarNumerosPares();
        showMenu();
        int opcion = scanner.nextInt();scanner.nextLine();    //lee la opción que ingresa el usuario en la terminal
        
        while (opcion !=3) {
            switch (opcion) {
                case 1:
                    //valida si el nombre ingresado se encuentra en la lista de nombres
                    System.out.println("╔═════════════════════╗");
                    System.out.println("║ Introduce tu nombre ║");
                    System.out.println("╚═════════════════════╝");
                    String name = scanner.nextLine();
                    if (NameValidator.validateName(name)) {
                        System.out.println("╔═════════════════════════════════════════════════════╗");
                        System.out.println("║ Tu nombre ya se encuentra registrado, ¡Felicidades! ║");
                        System.out.println("╚═════════════════════════════════════════════════════╝");
                    } else {
                        System.out.println("╔═════════════════════════════════════════════════════╗");
                        System.out.println("║ Tu nombre no se encuentra registrado, ¡Mala suerte! ║");
                        System.out.println("╚═════════════════════════════════════════════════════╝");
                    }
                    break;
                case 2:
                    //genera los números pares del 2 al 100
                    System.out.println("╔═══════════════════════════════════════════════════════╗");
                    System.out.println("║  En 100 números los siguientes son los números pares: ║");
                    System.out.println("╚═══════════════════════════════════════════════════════╝");
                    numerosPares = Number.generarNumerosPares();
                    Number.mostrarNumeros(numerosPares);
                    System.out.println();
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
    public static void showMenu(){
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║              MENÚ              ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║     1. Validar Nombres         ║");
        System.out.println("║     2. Generador de números    ║");
        System.out.println("║     3. Salir                   ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.print("Seleccione una opción: ");

    }
}
