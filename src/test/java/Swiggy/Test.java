package Swiggy;

public class Test {
    public static void main(String[] args) {

        Address address=new Address();
        address.area="Hitech-city";
        address.flatNo="409";
        address.houseNo="4-187";
        address.area="508246";

        User user =new User();
        user.name="vijay";
        user.email="vijaybareddy143@gmail.com";
        user.mobileNumber="9154788755";
        user.address=address;


        Restaurant restaurant=new Restaurant();
        restaurant.name="kk";
        restaurant.address=address;

        System.out.println(restaurant.name);








    }
}
