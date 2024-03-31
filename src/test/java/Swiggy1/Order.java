package Swiggy1;

public class Order {
    public OrderItems orderItems;
    public String orderId;
    public double price;
    public Address address;

    @Override
    public String toString() {
        return "Order{" +
                "orderItems=" + orderItems +
                ", orderId='" + orderId + '\'' +
                ", price=" + price +
                ", address=" + address +
                '}';
    }
}
