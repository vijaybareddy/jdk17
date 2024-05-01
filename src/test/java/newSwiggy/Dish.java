package newSwiggy;

public class Dish {
    public String dishName;
    public String dishType;
    public String dishRating;

    public Dish(String dishName,String dishType){
        this.dishName=dishName;
        this.dishType=dishType;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", dishType='" + dishType + '\'' +
                ", dishRating='" + dishRating + '\'' +
                '}';
    }
}
