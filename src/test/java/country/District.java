package country;

public class District {
    public String name;
    public String pinCode;
    public Country country;

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", country=" + country +
                '}';
    }
}
