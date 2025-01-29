package edu.jose.vazquez.actividades.actividad3.process;
import edu.jose.vazquez.actividades.actividad3.models.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona el stock de la tienda.
 */
public class StoreStockManager {
        /**
         * Lista de objetos de tipo Product.
         */
     ArrayList<Product> products;
            /**
             * Constructor de la clase StoreStockManager.
             */
            public StoreStockManager(){
                this.products = new ArrayList<>();
            }
            /**
             * Método que añade un producto a la lista de productos de la tienda y recibe los siguientes parámetros:
             * @param description
             * @param price
             * @param code
             * @param type
             * @param tax
             */
            public void addProduct(String description, double price, String code, String type, double tax){
                Product newProducts = new Product(description, price, code, type, tax);
                products.add(newProducts);
    }
    /**
     * metodo que obtiene la lista de productos.
     * @return Lista de productos.
     */
    public  List<Product> getProducts(){
        return this.products;
    }   

}
