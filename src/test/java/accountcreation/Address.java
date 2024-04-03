package accountcreation;

public class Address {
    public String area;
    public String country;
    public int pinCode;
    public int flatNo;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", country='" + country + '\'' +
                ", pinCode=" + pinCode +
                ", flatNo=" + flatNo +
                '}';
    }
}
