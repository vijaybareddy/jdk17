package Bank6;

public class Test {
    public static void main(String[] args) {
        ProductSpecfication productSpecfication=new ProductSpecfication();
        productSpecfication.jens="tone";
        productSpecfication.brand="vijay";
        productSpecfication.colour="black";
        productSpecfication.size=34;
        productSpecfication.type="jean";


        ShoppingService shoppingService=new ShoppingService();
        Products products=shoppingService.Selectionproducts(productSpecfication);
        System.out.println(products.toString());

    }
}
