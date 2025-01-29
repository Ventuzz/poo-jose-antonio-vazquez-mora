package edu.jose.vazquez.actividades.actividad3.process;
import edu.jose.vazquez.actividades.actividad3.models.Product;
import java.util.ArrayList;
import java.util.List;

public class StoreStockManager {
     ArrayList<Product> products;
        
            public StoreStockManager(){
                this.products = new ArrayList<>();
            }
        
            public void addProduct(String description, double price, String code, String type, double tax){
                Product newProducts = new Product(description, price, code, type, tax);
                products.add(newProducts);
    }

    public  List<Product> getProducts(){
        return this.products;
    }   

}
