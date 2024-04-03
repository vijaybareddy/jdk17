package accountcreation;

public class User {
    public String dateOfBirth;
    public long mobileNumber;
    public int aadharNumber;
    public String panNumber;

    public Address address;
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "User{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", aadharNumber=" + aadharNumber +
                ", panNumber='" + panNumber + '\'' +
                ", address=" + address +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
