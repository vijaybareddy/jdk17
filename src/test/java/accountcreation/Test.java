package accountcreation;

public class Test {
    public static void main(String[] args) {
        User user=new User();


        Address userAddress=new Address();
        userAddress.flatNo=3/6;
        userAddress.pinCode=500090;
        userAddress.country="India";
        userAddress.area="Miyapur";

       user.dateOfBirth="19-02-2000";
       user.mobileNumber=9154788755l;
       user.aadharNumber=1234;
       user.panNumber="ESBAE956A";
       user.address=userAddress;
       user.firstName="BAREDDY";
       user.lastName="Vijay";

       AccountService accountService=new AccountService();
        PassBook passBook=accountService.createAccount(user);

        System.out.println(passBook.accountHolderName);
        System.out.println(passBook);





    }
}
