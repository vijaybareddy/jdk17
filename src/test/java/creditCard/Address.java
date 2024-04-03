package creditCard;

public class Address {
    public String area;
    public String city;
    public String flotNo;
    public String pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", flotNo='" + flotNo + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
