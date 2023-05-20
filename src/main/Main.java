package main;

import Abstract.Product;
import cashier.Cashier;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();

        Product product = new Product("Roti Sobek", 15.00) {
            @Override
            public double calculateTax() {
                return getHarga() * 0.1;
            }
        };
        cashier.addProduct(product); // Menggunakan objek product, bukan objek inner class

        Product product2 = new Product("Kaos", 35.00) {
            @Override
            public double calculateTax() {
                return getHarga() * 0.2;
            }
        };
        cashier.addProduct(product2); // Menggunakan objek product2, bukan objek inner class

        double total = cashier.calculateTotal();
        System.out.println("Total harga: $" + total);
    }
}


