package Equalshashcode;

public class EgualsHashCodeDemoTest {
    public static void main(String[] args) {
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
        System.out.println("reflexive Test starts here");
        System.out.println();

        System.out.println("reflexive Test starts here");

        System.out.println(address1.equals(test));
        System.out.println( address1.equals( address2));
        System.out.println( address2.equals( address1));
        System.out.println("address1"+address1.hashCode());
        System.out.println("address2"+address2.hashCode());
        System.out.println(address1.equals(""));

    }
}
