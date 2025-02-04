package edu.jose.vazquez.actividades.actividad3.process;

/**
 * Clase que calcula el precio de un producto.
 */
public class ProductPriceCalculator {
    /**
     * Método que calcula el precio de un producto y recibe los siguientes parámetros:
     * @param price el precio del producto sin impuestos.
     * @param utility la utilidad que se le quiere agregar al producto.
     * @return el precio final del producto con el impuesto incluido.
     * se calcula el precio final del producto con el impuesto incluido.
     */
    public static double getPrice(double price, double utility) {
        double profit = price * utility / 100;
        double finalPrice = price + profit;
        double tax = finalPrice * 0.16;
        return finalPrice + tax;
    }


    
}
