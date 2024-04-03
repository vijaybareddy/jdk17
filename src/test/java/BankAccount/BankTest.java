package BankAccount;

public class BankTest {
    public static void main(String[] args) {
        BankingService bankingService=new BankingService();
        Userinfo userinfo=new Userinfo();
        userinfo.fistName="Vijay";
        userinfo.lastName="Bareddy";
        userinfo.adhar="1234 5678 0987";
        userinfo.phNo="9154788755";
        userinfo.gender="m";
        userinfo.dob="19/02/2000";
        AccountInfo details=bankingService.accountInfo(userinfo);
        System.out.println(details.accNo);
    }
}
