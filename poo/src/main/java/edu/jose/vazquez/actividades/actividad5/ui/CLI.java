package edu.jose.vazquez.actividades.actividad5.ui;

import java.io.IOException;
import java.util.Scanner;
import edu.jose.vazquez.actividades.actividad5.process.*;

public class CLI {
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 11) {
            showMenu();
            opcion = validation(scanner);
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número:");
                    int a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    int b = scanner.nextInt();
                    System.out.println("La suma de los números es: " + new Suma().apply(a, b));
                    break;
                case 2:
                    System.out.println("Ingrese el primer número:");
                    int x = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    int y = scanner.nextInt();
                    System.out.println("La resta de los números es: " + new Resta().apply(x, y));
                    break;
                case 3:
                    System.out.println("Ingrese el primer número:");
                    int c = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    int d = scanner.nextInt();
                    System.out.println("La multiplicación de los números es: " + new Multiplicacion().apply(c, d));
                    break;
                case 4:
                    System.out.println("Ingrese el primer número:");
                    int g = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    int h = scanner.nextInt();
                    if (h == 0) {
                        System.out.println("No se puede dividir entre 0");
                        break;
                    }
                    System.out.println("La división de los números es: " + new Division().apply(g, h));
                    break;
                case 5:
                    System.out.println("Ingrese el número:");
                    int e = scanner.nextInt();
                    System.out.println("Ingrese la potencia:");
                    int f = scanner.nextInt();
                    System.out.println("La potencia de los números es: " + new Potencia().apply(e, f));
                    break;
                case 6:
                    System.out.println("Ingrese el número del que quiere calcular el logaritmo:");
                    int i = scanner.nextInt();
                    System.out.println("Ingrese la base del logaritmo:");
                    int j = scanner.nextInt();
                    System.out.println("El logaritmo de los números es: " + new Logaritmo().apply(i, j));
                    break;
                case 7:
                    System.out.println("Ingrese el dividendo:");
                    int k = scanner.nextInt();
                    System.out.println("Ingrese el divisor:");
                    int l = scanner.nextInt();
                    if (l == 0) {
                        System.out.println("No se puede dividir entre 0");
                        break;
                    }
                    System.out.println("El módulo de la división de esos números es: " + new Modulo().apply(k, l));
                    break;
                case 8:
                    System.out.println("Ingrese el número para calcular el módulo del logaritmo:");
                    int m = scanner.nextInt();
                    System.out.println("Ingrese la base del logaritmo:");
                    int n = scanner.nextInt();
                    if (n == 0) {
                        System.out.println("No se puede dividir entre 0");
                        break;
                    }
                    System.out.println("El módulo del logaritmo de los números es: " + new ModLog().apply(m, n));
                    break;
                case 9:
                    System.out.println("Ingrese el número para calcular la raíz:");
                    int o = scanner.nextInt();
                    System.out.println("Ingrese el índice de la raíz:");
                    int p = scanner.nextInt();
                    System.out.println("La raíz más aproximada al número que solicitaste es: " + new Raiz().apply(o, p));
                    break;
                case 10:
                    System.out.println("Ingrese el número para calcular el módulo de la raíz:");
                    int q = scanner.nextInt();
                    System.out.println("Ingrese el índice de la raíz:");
                    int r = scanner.nextInt();
                    System.out.println("El módulo de la raíz de los números es: " + new ModRaiz().apply(q, r));
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    System.exit(0   );
                    break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("1. calcular suma de dos números");
        System.out.println("2. calcular resta de dos números");
        System.out.println("3. calcular multiplicación de dos números");
        System.out.println("4. calcular división de dos números");
        System.out.println("5. calcular potencia de un número");
        System.out.println("6. calcular logaritmo de un número");
        System.out.println("7. calcular módulo de una división");
        System.out.println("8. calcular modulo de un logaritmo");
        System.out.println("9. calcular raiz de un número");
        System.out.println("10. calcular modulo de una raiz");
        System.out.println("11. salir");
    }

    public static int validation(Scanner scanner) {
        int opcion;
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("No se puede dejar la opción en blanco. Intente de nuevo.");
                continue;
            }
            try {
                opcion = Integer.parseInt(input);
                if (opcion >= 1 && opcion <= 11) {
                    return opcion; 
                } else {
                    System.out.println("Ingrese una opción válida dentro del menú.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Prueba ingresando un número válido.");
            }
        }
    }

    public static void cleanScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error al limpiar la consola.");
        }
    }


}
