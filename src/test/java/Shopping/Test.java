package Shopping;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        // Create products
        Product shirtProduct = new Product();
        ProductSpecification shirtSpec = new ProductSpecification();
        shirtSpec.color = "Blue";
        shirtSpec.price = 1000;
        shirtSpec.size = 40;
        shirtProduct.type = "Shirt";
        shirtProduct.productSpecfication=shirtSpec;

        // Create shop
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(shirtProduct);
        shop.products = products;

        // User input
        String userInputType = "Shirt";
        String userInputColor = "Blue";
        int userSize=40;

        // Find product
        Product foundProduct = shop.findProduct(userInputType,userInputColor,userSize);
        if (foundProduct != null) {
            System.out.println("Matching product found: " + foundProduct.type + " (Color: " + foundProduct.productSpecfication.color + ")  " +"Size : "+foundProduct.productSpecfication.size);
        } else {
            System.out.println("No matching product found.");
        }
    }
}

