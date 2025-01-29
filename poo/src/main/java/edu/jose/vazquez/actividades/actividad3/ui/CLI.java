package edu.jose.vazquez.actividades.actividad3.ui;

import java.util.Scanner;

import edu.jose.vazquez.actividades.actividad3.models.Product;
import edu.jose.vazquez.actividades.actividad3.process.ProductCalculator;
import edu.jose.vazquez.actividades.actividad3.process.StoreStockManager;

public class CLI {

        public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        StoreStockManager StoreManager = new StoreStockManager();
        showMenu();
        int opcion = scanner.nextInt();scanner.nextLine();    
        
        while (opcion !=5) {
            switch (opcion) {
                case 1:
                    System.out.println("╔══════════════════════════════════╗");
                    System.out.println("║ Introduce el valor del producto  ║");
                    System.out.println("╚══════════════════════════════════╝");
                    double price = -1;
                    while (price < 0) {
                        try {
                            System.out.print("Precio: ");
                            price = Double.parseDouble(scanner.nextLine());
                            if (price < 0) {
                                System.out.println("Error: El precio no puede ser negativo. Inténtalo de nuevo.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingresa un número válido.");
                        }
                    }
                    System.out.println("╔═══════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║ Introduce el porcentaje de utilidad que quieres obtener del producto  ║");
                    System.out.println("╚═══════════════════════════════════════════════════════════════════════╝");
                    double utility = -1;
                    while (utility < 0) {
                        try {
                            System.out.print("Utilidad (%): ");
                            utility = Double.parseDouble(scanner.nextLine());
                            if (utility < 0) {
                                System.out.println("Error: La utilidad no puede ser negativa. Inténtalo de nuevo.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingresa un número válido.");
                        }
                    }
                    double finalPrice = ProductCalculator.priceCalculator(price, utility);
                    System.out.println("╔════════════════════════════════════════════╗");
                    System.out.println("║ El precio final del producto es: " + finalPrice + " ║"); 
                    System.out.println("╚════════════════════════════════════════════╝");
                    break;
/** 
 * System.out.println("╔══════════════════════════════════╗");
                    System.out.println("║ Introduce el valor del producto  ║");
                    System.out.println("╚══════════════════════════════════╝");
                    double price = scanner.nextDouble();
                    System.out.println("╔═══════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║ Introduce el porcentaje de utilidad que quieres obtener del producto  ║");
                    System.out.println("╚═══════════════════════════════════════════════════════════════════════╝");
                    double utility = scanner.nextDouble();
                    double finalPrice = ProductCalculator.priceCalculator(price, utility);
                    System.out.println("╔════════════════════════════════════════════╗");
                    System.out.println(  "║ El precio final del producto es: " + finalPrice + "     ║"); 
                    System.out.println("╚════════════════════════════════════════════╝");
                    break;
 */
                    
                case 2:
                    System.out.println("╔═════════════════════════════════╗");
                    System.out.println("║  Ingresa el costo del producto: ║");
                    System.out.println("╚═════════════════════════════════╝");
                    double cost = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("╔═══════════════════════════════════════════╗");
                    System.out.println("║  Ingresa una descripción para el producto ║");
                    System.out.println("╚═══════════════════════════════════════════╝");
                    String description = scanner.nextLine();

                    System.out.println("╔═══════════════════════════════════╗");
                    System.out.println("║  Ingresa el código del producto:  ║");
                    System.out.println("╚═══════════════════════════════════╝");
                    String code = scanner.nextLine();

                    System.out.println("╔═══════════════════════════════════════╗");
                    System.out.println("║  Ingresa el tipo de producto que es:  ║");
                    System.out.println("╚═══════════════════════════════════════╝");
                    String type = scanner.nextLine();

                    System.out.println("╔═══════════════════════════════════╗");
                    System.out.println("║  El impuesto corresponde al 16%:  ║");
                    System.out.println("╚═══════════════════════════════════╝");
                    double tax = cost * 0.16;

                    StoreManager.addProduct(description, cost, code, type, tax);
                    System.out.println("╔═══════════════════════════════╗");
                    System.err.println("║  Producto agregado con exito  ║");
                    System.out.println("╚═══════════════════════════════╝");
                    break;
                case 3:
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║  El catalogo actual es: ║");
                    System.out.println("╚═════════════════════════╝");
                    StoreManager.getProducts().forEach(CLI::showProduct);

                    break;
                case 4:
                    System.out.println("╔═════════════════════════╗");
                    System.out.println("║  Comparar productos     ║");
                    System.out.println("╚═════════════════════════╝");
                    if (StoreManager.getProducts().size() < 2) {
                        System.out.println("╔══════════════════════════════════════════════╗");
                        System.out.println("║  No hay suficientes productos para comparar  ║");
                        System.out.println("╚══════════════════════════════════════════════╝");
                        break;
                    } else if (StoreManager.getProducts().size() > 2) {
                        System.out.println("╔════════════════════════════════════════════╗");
                        System.out.println("║  Se compararán los primeros dos productos  ║");
                        System.out.println("╚════════════════════════════════════════════╝");
                    }
                    compararProductos(StoreManager.getProducts().get(0), StoreManager.getProducts().get(1));
                    System.out.println(compararProductos(StoreManager.getProducts().get(0), StoreManager.getProducts().get(1)));
                    break;
                default:
                    System.out.println("╔═══════════════════╗");
                    System.out.println("║  Opción inválida  ║");
                    System.out.println("╚═══════════════════╝");
                    break;
            }
            showMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("╔══════════╗");
        System.out.println("║  Adiós!  ║");
        System.out.println("╚══════════╝");


    }

        public static String compararProductos(Product producto1, Product producto2) {
        if (producto1.getPrice() > producto2.getPrice()) {
            return "El producto 1 es más caro que el producto 2";
        } else if (producto1.getPrice() < producto2.getPrice()) {
            return "El producto 2 es más caro que el producto 1";
        } else {
            return "Los productos tienen el mismo precio";
        }
    }

    public static void showProduct(Product product) {
        System.out.println("╔═══════════════════╗");
        System.out.println("║ Producto          ║");
        System.out.println("╚═══════════════════╝");
        System.out.println("╔═══════════════════╗");
        System.out.println("  ║ Descripción: " + product.getDescription() + "║");
        System.out.println("  ║ Precio: " + product.getPrice() + "║");
        System.out.println("  ║ Código: " + product.getCode() + "║");
        System.out.println("  ║ Tipo: " + product.getType() + "║");
        System.out.println("  ║ Impuesto: " + product.getTax() + "║");
        System.out.println("╚═══════════════════╝");
    }

    public static void showMenu(){
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                           MENÚ                            ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║     1. Consultar precio recomendado para un producto      ║");
        System.out.println("║     2. Agregar producto al stock de la tienda             ║");
        System.out.println("║     3. Mostrar stock de la tienda                         ║");
        System.out.println("║     4. Comparar productos almacenados                     ║");
        System.out.println("║     5. Salir                                              ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        System.out.print("Seleccione una opción: ");

    }
}
