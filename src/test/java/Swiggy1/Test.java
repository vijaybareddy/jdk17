package Swiggy1;

public class Test {
    public static void main(String[] args) {
        Address address=new Address();
        address.flatNo="206";
        address.streetName="vijay";
        address.area="hyd";
        address.pinCode="508246";

        Products products=new Products();
        products.productName="Biryani";
        products.productPrice="200";
        products.vendor="vijay";
        products.quantity="3";

        OrderItems orderItems=new OrderItems();
        orderItems.price=600;
        orderItems.quantity=3;
        orderItems.products=products;

        Order order=new Order();
        order.orderId="23456";
        order.orderItems=orderItems;
        order.price=600;
        order.address=address;

        System.out.println(order);


    }
}
