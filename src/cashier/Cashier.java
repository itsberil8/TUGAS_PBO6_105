package cashier;

import java.util.ArrayList;
import java.util.List;

// Tambahkan pernyataan impor untuk kelas Product
import Abstract.Product;

public class Cashier {
    private List<Product> products;

    public Cashier() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getHarga() + product.calculateTax();
        }

        return total;
    }
}


