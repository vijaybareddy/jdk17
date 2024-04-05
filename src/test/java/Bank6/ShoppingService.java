package Bank6;

public class ShoppingService {
    public Products Selectionproducts(ProductSpecfication productSpecfication){
        Products products=new Products();
        products.jens=productSpecfication.jens;
        products.brand=productSpecfication.brand;
        products.colour=productSpecfication.colour;
        products.price=3000;
        products.size=productSpecfication.size;
        products.type=productSpecfication.type;


        return products;




    }


}
