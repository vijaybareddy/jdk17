package accountcreation;



import java.util.UUID;

public class AccountService {
    public PassBook createAccount(User user){
        PassBook passBook=new PassBook();

        Address address=new Address();
        address.area="Nizampet";
        address.country="India";
        address.pinCode=500090;
        address.flatNo=305;

        String name=user.firstName+""+user.lastName;
        passBook.accountHolderName=name;
        passBook.userAddress= user.address;
        passBook.bankAddress=address;
        passBook.accountNumber= UUID.randomUUID().toString();
        passBook.ifscCode="SBIN0001763";

        return passBook;

    }
}
