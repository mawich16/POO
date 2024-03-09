package aula04;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

    private List<Product> products;

    public CashRegister() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s %-8s %-8s %-8s\n", "Product", "Price", "Quantity", "Total"));
        double totalValue = 0.0;
        for (Product product : products) {
            sb.append(String.format("%-12s %5.2f %10d %6.2f\n", product.getName(), product.getPrice(), product.getQuantity(), product.getTotalValue()));
            totalValue += product.getTotalValue();
        }
        sb.append("Total value: ").append(String.format("%.2f", totalValue));
        return sb.toString();
    }

}

public class Ex42 {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        System.out.println(cr);

    }
}
