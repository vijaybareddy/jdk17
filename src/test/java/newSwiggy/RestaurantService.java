package newSwiggy;

public class RestaurantService {
    public void getRestuarntService(RestaurantResponse restaurantRespones,String name,Dish dishName){
        restaurantRespones.restaurantMap.forEach((K,v)-> {
            if (v.restaurantName.equals(name)) {
                System.out.println("restaurant name:" + name);
                v.dishList.forEach((dish) -> {
                    if (dish.dishName.equals(dishName.dishName) && dish.dishType.equals(dishName.dishType)) {
                        System.out.println("selected dish is :" + dishName.dishName + "----" + "dish type:" + dish.dishType);
                    }

                });
            }
        });


            }

        }


