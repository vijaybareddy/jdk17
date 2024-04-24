package functionsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiSupplierDemoTest {

    Supplier<List<Restaurent>>restarentList= ()->{
        List<Restaurent>list=new ArrayList<>();

        Restaurent restaurent=new Restaurent();
        restaurent.name="Mendi";
        list.add(restaurent);
        Restaurent restaurent1=new Restaurent();
        restaurent1.name="KFC";
        list.add(restaurent1);
        return list;

    };
    public List<Restaurent>getRestaurentList(){
        List<Restaurent>list=new ArrayList<>();
        Restaurent restaurent=new Restaurent();
        restaurent.name="Mendi";
        list.add(restaurent);
        Restaurent restaurent1=new Restaurent();
        restaurent1.name="KFC";
        list.add(restaurent1);
        return list;

    }

Consumer<List<Restaurent>>restaurentConsumer=(abc)->{
        abc.stream().forEach(test->{
            System.out.println("consumer"+test.name);
        });
};
    public static void main(String[] args) {
        BiSupplierDemoTest test=new BiSupplierDemoTest();
        List<Restaurent>funcList= test.restarentList.get();
        List<Restaurent>methodList=test.getRestaurentList();

        System.out.println("funcList"+funcList);
        System.out.println("methodList"+methodList);
        test.restaurentConsumer.accept(funcList);

    }
}

