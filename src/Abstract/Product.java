package Abstract;

public abstract class Product {
    private String nama;
    private double harga;

    public Product(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double calculateTax();

    // Kelas inner untuk produk makanan
    public class FoodProduct {
        private boolean isFresh;

        public FoodProduct(boolean isFresh) {
            this.isFresh = isFresh;
        }

        public boolean isFresh() {
            return isFresh;
        }
    }

    // Kelas inner untuk produk pakaian
    public class ApparelProduct {
        private String size;

        public ApparelProduct(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }
    }
}

