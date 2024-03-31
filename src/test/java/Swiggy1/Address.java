package Swiggy1;

public class Address {
    public String flatNo;
    public String streetName;
    public String area;
    public String pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", area='" + area + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
