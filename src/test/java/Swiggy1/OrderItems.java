package Swiggy1;

public class OrderItems {
    public Products products;
    public int quantity;
    public double price;

    @Override
    public String toString() {
        return "OrderItems{" +
                "products=" + products +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

