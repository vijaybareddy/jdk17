package Shopping;

import java.util.List;

public class Shop {
    public List<Product> products;

    public Product findProduct(String type, String color, int size) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.type.equals(type) && product.productSpecfication.color.equals(color) && product.productSpecfication.size == size) {
                return product;
            }
        }
        return null;
    }
}


