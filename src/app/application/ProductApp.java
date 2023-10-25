package app.application;

// import semua class yang ada di package data
import app.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook", 10);

        System.out.println(product);
    }
}
