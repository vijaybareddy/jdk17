package newswiggy;


    import java.util.ArrayList;
import java.util.List;

    public class Swiggy {
        public static List<Restaurant> restaurants;

        public Swiggy() {
            this.restaurants = new ArrayList<>();

        }
        public void addRestaurant(Restaurant restaurant) {
            restaurants.add(restaurant);
        }

        public  List<Restaurant> getRestaurants() {
            return restaurants;
        }


}
