package SwiggyApp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SwiggyService {
    Supplier<RestaurentList> getRestaurent=()-> {
        Restaurent restaurent = new Restaurent();
        restaurent.Name = "bawarachi";
        restaurent.PhNo = "9010005566";
        restaurent.Rating = "4.5";
        Address restaurentAddress = new Address("LB Nager", "5", "45-888", "500043");

        Dishes chicken = new Dishes("Chicken", 650);
        Dishes mutton = new Dishes("Mutton", 850);
        Dishes fish = new Dishes("fish", 750);

        List<Dishes> dishes = new ArrayList<>();
        dishes.add(chicken);
        dishes.add(mutton);
        dishes.add(fish);

        restaurent.dishesList = dishes;


        Restaurent restaurent1 = new Restaurent();
        restaurent1.Name = "bawarachi";
        restaurent1.PhNo = "9010005555";
        restaurent.Rating = "4.5";
        Address restaurent1Address = new Address("hitech city", "2", "4-348", "500043");

        Dishes chicken1 = new Dishes("Chicken", 650);
        Dishes mutton1 = new Dishes("Mutton", 850);
        Dishes fish1 = new Dishes("fish", 750);

        List<Dishes> dishes1 = new ArrayList<>();
        dishes1.add(chicken);
        dishes1.add(mutton);
        dishes1.add(fish);

        restaurent1.dishesList = dishes1;
        Restaurent restaurent2 = new Restaurent();
        restaurent2.Name = "bawarachi";
        restaurent2.PhNo = "9010005577";
        restaurent.Rating = "4.5";
        Address restaurent2Address = new Address("sr nager", "7", "4-38", "500045");

        Dishes chicken2 = new Dishes("Chicken", 650);
        Dishes mutton2 = new Dishes("Mutton", 850);
        Dishes fish2 = new Dishes("fish", 750);

        List<Dishes> dishes2 = new ArrayList<>();
        dishes2.add(chicken);
        dishes2.add(mutton);
        dishes2.add(fish);

        restaurent2.dishesList = dishes2;


        List<Restaurent> restaurents = new ArrayList<>();
        restaurents.add(restaurent);
        restaurents.add(restaurent1);
        restaurents.add(restaurent2);



        RestaurentList restaurentList=new RestaurentList();
        restaurentList.restaurentList=restaurents;

        return restaurentList;


    };


}    
