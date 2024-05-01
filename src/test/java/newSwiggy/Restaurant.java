package newSwiggy;

import java.util.List;

public class Restaurant {
    public String restaurantName;
    public Address address;
    public List<Dish>dishList;
    public Rating restaurantRating;


    public Restaurant(String restaurantName,List<Dish>dishList,Rating restaurantRating){
        this.restaurantName=restaurantName;
        this.dishList=dishList;
        this.restaurantRating=restaurantRating;

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", address=" + address +
                ", dishList=" + dishList +
                ", restaurantRating=" + restaurantRating +
                '}';
    }
}
