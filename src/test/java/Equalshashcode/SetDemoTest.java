package Equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args) {
        Set<Car>carSet=new HashSet<>();
        Car car1=new Car();
        car1.name="punch";


        Car car2=new Car();
        car2.name="punch";
        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);

        Address address1=new Address();
        Address test=address1;
        address1.area="Miyapur";
        address1.state="TG";
        address1.street="GLR";
        address1.flotNo="3/2";
        address1.pinCode="500090";


        Address address2=new Address();
        address2.area="Miyapur";
        address2.state="TG";
        address2.street="GLR";
        address2.flotNo="3/2";
        address2.pinCode="500090";


        Set<Address>addressSet=new HashSet<>();
        addressSet.add(address1);
        addressSet.add(address2);
        System.out.println(addressSet);

    }
}
