package Shopping;

import Bank6.ProductSpecfication;

public class Product {
    public String type;

    public String price;
    public String brand;
    public String color;
    public ProductSpecification productSpecfication;


    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", productSpecfication=" + productSpecfication +
                '}';
    }
}
