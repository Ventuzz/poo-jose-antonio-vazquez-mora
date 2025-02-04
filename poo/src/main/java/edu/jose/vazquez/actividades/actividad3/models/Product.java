package edu.jose.vazquez.actividades.actividad3.models;

/**
 * Clase que representa un producto.
 */
public class Product {

    private String description;
    private double price;
    private String code;
    private String type;
    private double tax;

    /**
     * Constructor de la clase Product que recibe los siguientes parámetros:
     * @param description
     * @param price
     * @param code
     * @param type
     * @param tax
     */
    public Product(String description, double price, String code, String type, double tax) {
        setDescription(description);
        setPrice(price);
        setCode(code);
        setType(type);
        setTax(tax);
    }


    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public double getTax() {
        return tax;
    }
    /**
     * Método que asigna la descripción del producto y valida que no esté vacía.
     * @param description
     */
    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.description = description;
    }

    /**
     * Método que asigna el precio del producto y valida que no sea negativo.
     * @param price
     */
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.price = price;
    }

    /**
     * Método que asigna el código del producto y valida que no esté vacío.
     * @param code
     */
    public void setCode(String code) {
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.code = code;
    }
    /**
     * Método que asigna el tipo del producto y valida que no esté vacío.
     * @param type
     */
    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede estar vacío.");
        }
        this.type = type;
    }
    /**
     * Método que asigna el impuesto del producto y valida que no sea negativo.
     * @param tax
     */
    public void setTax(double tax) {
        if (tax < 0) {
            throw new IllegalArgumentException("El impuesto no puede ser negativo.");
        }
        this.tax = tax;
    }


}
