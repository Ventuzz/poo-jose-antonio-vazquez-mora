package edu.jose.vazquez.actividades.actividad3.process;
import edu.jose.vazquez.actividades.actividad3.models.Product;

public class ProductCalculator {
    public static double priceCalculator(double price, double utility) {
        double profit = price * utility / 100;
        double finalPrice = price + profit;
        double tax = finalPrice * 0.16;
        return finalPrice + tax;
    }


    
}
