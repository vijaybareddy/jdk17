package creditCard;

public class User {

    public String name;
    public String phoneName;
    public String adharNumber;
    public String panNumber;

    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", adharNumber='" + adharNumber + '\'' +
                ", panNumber='" + panNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
