package edu.jose.vazquez.actividades.actividad3.models;

public class Product {
    private String description;
    private double price;
    private String code;
    private String type;
    private double tax;

    public Product(String description, double price, String code, String type, double tax) {
        this.description = description;
        this.price = price;
        this.code = code;
        this.type = type;
        this.tax = tax;
    }

    public String toString() {
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

    public void showProduct() {
        System.out.println("╔═══════════════════╗");
        System.out.println("║ Producto          ║");
        System.out.println("╚═══════════════════╝");
        System.out.println("╔═══════════════════╗");
        System.out.println("  ║ Descripción: " + description + "║");
        System.out.println("  ║ Precio: " + price + "║");
        System.out.println("  ║ Código: " + code + "║");
        System.out.println("  ║ Tipo: " + type + "║");
        System.out.println("  ║ Impuesto: " + tax + "║");
        System.out.println("╚═══════════════════╝");
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


}
