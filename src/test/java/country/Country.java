package country;

public class Country {
    public String name;
    public String numberCode;
    public String currency;
    public State state;

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", numberCode='" + numberCode + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
