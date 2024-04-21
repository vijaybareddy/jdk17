package streamsdemo;

import java.util.*;

public class AccountServices {
    public Map<Account,Account>getAccountSummery() {

        Account account=new Account();
        User user=new User();
        AccountDetails accountDetails=new AccountDetails();

        Address userAddress=new Address();
        userAddress.doorNo="234";
        userAddress.street="KPHb";
        userAddress.State="Tg";
        userAddress.pinCode="900056";


        Address bankAddress=new Address();
        bankAddress.doorNo="234";
        bankAddress.street="KPHb";
        bankAddress.State="Tg";
        bankAddress.pinCode="900056";

        user.address= userAddress;
        user.name="Vijay";


        AccountDetails accountDetailsCredit=new AccountDetails();
        accountDetailsCredit.amount=1000;
        accountDetailsCredit.description="my self";
        accountDetailsCredit.txDate=new Date();
        accountDetailsCredit.valueDate=new Date();
        accountDetailsCredit.type="c";

        AccountDetails accountDetailsDebit=new AccountDetails();
        accountDetailsDebit.amount=400;
        accountDetailsDebit.description="my self";
        accountDetailsDebit.txDate=new Date();
        accountDetailsDebit.valueDate=new Date();
        accountDetailsDebit.type="D";

        account.accountDetails=new ArrayList<>();
        account.accountDetails.add(accountDetailsCredit);
        account.accountDetails.add(accountDetailsDebit);
        account.accountNumber="123456";
        account.address=bankAddress;
        account.ifscCode="SBI12344";
        account.user=user;
        account.balance=5000 ;



       Map<Account,Account>accountSummary=new HashMap<>();
       accountSummary.put(account,account);
        return accountSummary;








    }

}
