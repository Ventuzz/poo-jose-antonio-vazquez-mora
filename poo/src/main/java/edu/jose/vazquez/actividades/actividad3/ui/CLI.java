package edu.jose.vazquez.actividades.actividad3.ui;

import java.util.Scanner;

import edu.jose.vazquez.actividades.actividad3.models.Product;
import edu.jose.vazquez.actividades.actividad3.process.ProductPriceCalculator;
import edu.jose.vazquez.actividades.actividad3.process.StoreStockManager;

/**
 * CLI es la clase que se encarga de la interfaz de línea de comandos para nuestra aplicación de gestión de stock una tienda.
 */
public class CLI {

    static StoreStockManager storeManager = new StoreStockManager();
        /**
         * Método que se encarga de correr la aplicación y mostrar el menú principal.
         * Cuenta con validaciones para asegurarse de que el usuario ingrese una opción correcta dentro del menú.
         * Cada opción del menú tiene su propia lógica y validaciones.
         * La aplicación se ejecuta hasta que el usuario elige la opción de salir.
         */
            public static void runApp() {
            Scanner scanner = new Scanner(System.in);
            int opcion = -1; 
            while (opcion !=5) {
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
                    /**
                     * Opción 1: Consultar precio recomendado para un producto, se pide el precio del producto y el porcentaje de utilidad que se desea obtener.
                     * Se calcula el precio final al que debe de venderse para ganar la cantidad deseada y se muestra en consola.
                     * Se valida que el precio no sea negativo y que el porcentaje de utilidad no sea negativo.
                     * Se muestra un mensaje de error si el usuario ingresa un valor no numérico.
                     */
                    case 1:
                        System.out.println("╔═══════════════════════════════════╗");
                        System.out.println("║ Introduce el precio del producto  ║");
                        System.out.println("╚═══════════════════════════════════╝");
                        double price = -1;
                        while (price < 0) {
                            try {
                                System.out.print("precio: ");
                                price = Double.parseDouble(scanner.nextLine());
                                if (price < 0) {
                                    System.out.println("╔═════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║  El precio no puede ser negativo, por favor inténtalo de nuevo. ║");
                                    System.out.println("╚═════════════════════════════════════════════════════════════════╝");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("╔══════════════════════════════════════════════════════════════╗");
                                System.out.println("║  Solo puedes ingresar numeros, por favor inténtalo de nuevo. ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════╝");
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
                                    System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║  La utilidad no puede ser negativa, por favor inténtalo de nuevo. ║");
                                    System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
                                }
                            } catch (IllegalArgumentException e) {
                                System.out.println("╔══════════════════════════════════════════════════════════════╗");
                                System.out.println("║  Solo puedes ingresar numeros, por favor inténtalo de nuevo. ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════╝");
                            }
                        }
                        double finalPrice = ProductPriceCalculator.getPrice(price, utility);
                        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║ El precio al que deberías de vender tu producto es: " + finalPrice + " pesos, para generar una utilidad del " + utility + "% ║"); 
                        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                        break;
                    /**
                     * Opción 2: Agregar producto al stock de la tienda, se pide la descripción, el costo, el código y el tipo de producto.
                     * Se calcula el impuesto correspondiente al 16% del costo del producto.
                     * Se valida que el costo no sea negativo y que la descripción, código y tipo no estén vacíos.
                     * Se muestra un mensaje de error si el usuario ingresa un valor no numérico.
                     * Se muestra un mensaje de éxito si el producto se agrega correctamente.
                     */    
                    case 2:
                        System.out.println("╔═════════════════════════════════╗");
                        System.out.println("║  Ingresa el costo del producto: ║");
                        System.out.println("╚═════════════════════════════════╝");
                        double cost = -1;
                        while (cost < 0) {
                            try {
                                System.out.print("Costo: ");
                                cost = Double.parseDouble(scanner.nextLine());
                                if (cost < 0) {
                                    System.out.println("╔════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║  El costo no puede ser negativo, por favor inténtalo de nuevo. ║");
                                    System.out.println("╚════════════════════════════════════════════════════════════════╝");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("╔══════════════════════════════════════════════════════════════╗");
                                System.out.println("║  Solo puedes ingresar numeros, por favor inténtalo de nuevo. ║");
                                System.out.println("╚══════════════════════════════════════════════════════════════╝");
                            }
                        }
    
                        System.out.println("╔═══════════════════════════════════════════╗");
                        System.out.println("║  Ingresa una descripción para el producto ║");
                        System.out.println("╚═══════════════════════════════════════════╝");
                        String description;
                            while (true) {
                                System.out.print("Descripción: ");
                                description = scanner.nextLine().trim();
                                if (description.isEmpty()) {
                                    System.out.println("╔═══════════════════════════════════════════════════════════════════════╗");
                                    System.out.println("║ La descripción del producto no puede estar vacía, Inténtalo de nuevo. ║");
                                    System.out.println("╚═══════════════════════════════════════════════════════════════════════╝");
                                } else {
                                    break;
                                }
                            }
                            
                        System.out.println("╔═══════════════════════════════════╗");
                        System.out.println("║  Ingresa el código del producto:  ║");
                        System.out.println("╚═══════════════════════════════════╝");
                        String code;
                        while (true) {
                            System.out.print("Código: ");
                            code = scanner.nextLine().trim();
                            if (code.isEmpty()) {
                                System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║   El código del producto no puede estar vacío, Inténtalo de nuevo.  ║");
                                System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
                        System.out.println("╔═══════════════════════════════════════╗");
                        System.out.println("║  Ingresa el tipo de producto que es:  ║");
                        System.out.println("╚═══════════════════════════════════════╝");
                        String type;
                        while (true) {
                            System.out.print("Tipo de producto: ");
                            type = scanner.nextLine().trim();
                            if (type.isEmpty()) {
                                System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
                                System.out.println("║  Tienes que describir qué tipo de producto es, Inténtalo de nuevo.  ║");
                                System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
                            } else {
                                break;
                            }
                        }
    
                        System.out.println("╔═══════════════════════════════════╗");
                        System.out.println("║  El impuesto corresponde al 16%:  ║");
                        System.out.println("╚═══════════════════════════════════╝");
                        double tax = cost * 0.16;
    
                        storeManager.addProduct(description, cost, code, type, tax);
                    System.out.println("╔═════════════════════════════════╗");
                    System.err.println("║  ¡Producto agregado con exito!  ║");
                    System.out.println("╚═════════════════════════════════╝");
                    break;
                /**
                 * Opción 3: Mostrar stock de la tienda, se muestra la información de todos los productos almacenados en la tienda.
                 * Se muestra la descripción, el precio, el código, el tipo y el impuesto de cada producto.
                 * Se muestra un mensaje de error si no hay productos en el stock.
                 */
                case 3:
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
                /**
                 * Opción 4: Comparar productos almacenados, se comparan los dos primeros productos almacenados en la tienda.
                 * Se muestra un mensaje diciendo si el primer producto es más caro, si el segundo producto es más caro o si tienen el mismo precio.
                 * Se muestra un mensaje de error si no hay al menos dos productos en el stock.
                 * En caso de tener más de dos productos, se muestra un mensaje diciendo que solo se compararán los dos primeros.
                 */
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
                /**
                 * opción 5: Salir de la aplicación, se muestra un mensaje de despedida.
                 * Se termina la ejecución de la aplicación.
                 */
                case 5:
                    System.out.println("╔══════════╗");
                    System.out.println("║  Adiós!  ║");
                    System.out.println("╚══════════╝");
                    break;
            }
        }
        



    }
        /**
         * Método que se encarga de comparar dos productos y regresar un mensaje con el resultado de la comparación.
         * @param producto1
         * @param producto2
         * @return Un mensaje de comparación entre los dos productos diciendonos si el primer producto fue mayor, menor o tienen el mismo precio
         */
        public static String compareProducts(Product producto1, Product producto2) {
        if (producto1.getPrice() > producto2.getPrice()) {
            return "╔═════════════════════════════════════════════╗"+"\n║ El producto 1 es más caro que el producto 2 ║"+" \n╚═════════════════════════════════════════════╝";
        } else if (producto1.getPrice() < producto2.getPrice()) {
            return "╔═════════════════════════════════════════════╗"+"\n║ El producto 2 es más caro que el producto 1 ║"+" \n╚═════════════════════════════════════════════╝";
        } else {
            return "╔══════════════════════════════════════╗"+"\n║ Los productos tienen el mismo precio ║"+" \n╚══════════════════════════════════════╝";
        }
    }


        /**
         * Método que se encarga de mostrar la información de un producto en la consola.
         * @param product
         */
    public static void showProduct(Product product) {
        System.out.println("╔═══════════════════╗");
        System.out.println("║      Producto     ║");
        System.out.println("╚═══════════════════╝");
        System.out.println("╔═══════════════════╗");
        System.out.println("║ Descripción: " + product.getDescription() + "║");
        System.out.println("║ Precio: " + product.getPrice() + "║");
        System.out.println("║ Código: " + product.getCode() + "║");
        System.out.println("║ Tipo: " + product.getType() + "║");
        System.out.println("║ Impuesto: " + product.getTax() + "% ║");
        System.out.println("╚═══════════════════╝");
    }

    /**
     * Método que se encarga de mostrar el menú principal de la aplicación.
     * Tiene una validación en caso de no tener productos en el stock, no se muestra la opción de mostrar el stock de la tienda.
     * Tiene una validación para mostrar la opción de comparar productos solo si hay al menos dos productos en el stock.
     */
    public static void showMenu(){
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                           MENÚ                            ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║     1. Consultar precio recomendado para un producto      ║");
        System.out.println("║     2. Agregar producto al stock de la tienda             ║");
        if (storeManager.getProducts().size() >= 1) {
            System.out.println("║     3. Mostrar stock de la tienda                         ║");
            
        }
        if (storeManager.getProducts().size() >= 2) {
            System.out.println("║     4. Comparar productos almacenados                     ║");
            
        }
        System.out.println("║     5. Salir                                              ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");



    }
}
