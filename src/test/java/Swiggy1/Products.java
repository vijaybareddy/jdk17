package Swiggy1;

public class Products {
    public String productName;
    public String productPrice;
    public String vendor;
    public String quantity;

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", vendor='" + vendor + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
