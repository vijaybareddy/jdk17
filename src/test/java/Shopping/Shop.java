package Shopping;

import java.util.List;

public class Shop {
    public List<Product> products;

    public Product findProduct(String type, String color, int size) {
        for (Product product: products) {
                if(product.type.equals(type)&&product.productSpecfication.color.equals(color)&&product.productSpecfication.size==size){
                    return product;
            }
        }
        return null;
    }
}

