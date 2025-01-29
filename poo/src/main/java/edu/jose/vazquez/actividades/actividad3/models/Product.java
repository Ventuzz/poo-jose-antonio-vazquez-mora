package edu.jose.vazquez.actividades.actividad3.models;

public class Product {
    private String description;
    private double price;
    private String code;
    private String type;
    private double tax;

    public Product(String description, double price, String code, String type, double tax) {
        setDescription(description);
        setPrice(price);
        setCode(code);
        setType(type);
        setTax(tax);
    }

    /**
     *     public String toString() {
        return "╔═══════════════════╗\n" +
               "║ Producto          ║\n" +
               "╚═══════════════════╝\n" +
               "╔════════════════════════╗\n" +
               "║ Descripción: " + description + " ║\n" +
               "║ Precio: " + price + " ║\n" +
               "║ Código: " + code + "  ║\n" +
               "║ Tipo: " + type + "    ║\n" +
               "║ Impuesto: " + tax + " ║\n" +
               "╚═══════════════════════╝";
    }
     */




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

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.description = description;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.price = price;
    }

    public void setCode(String code) {
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.code = code;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede estar vacío.");
        }
        this.type = type;
    }

    public void setTax(double tax) {
        if (tax < 0) {
            throw new IllegalArgumentException("El impuesto no puede ser negativo.");
        }
        this.tax = tax;
    }


}
