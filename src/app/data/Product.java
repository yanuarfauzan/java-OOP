package app.data;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price ){
        this.name = name;
        this.price = price;
    }

    // Override Method toString milik Class Object
    public String toString()
    {
        return "Product name: " + this.name + ", Price : " + this.price;
    }
}