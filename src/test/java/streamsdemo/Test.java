package streamsdemo;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        AccountServices accountServices = new AccountServices();
        Map<Account, Account> accountMap = accountServices.getAccountSummery();
        Account account = new Account();
        account.accountNumber = "123456";
        Account fullAccount = accountMap.get(account);
        System.out.println(fullAccount.accountNumber);
        Predicate<AccountDetails> predicate = (accountDetail) -> accountDetail.type.equals("c");
        List<AccountDetails> creditAccountDetails =
                fullAccount.accountDetails.stream()
                        .filter(accountDetails -> predicate.test(accountDetails))
                             .collect(Collectors.toList());
        System.out.println("Stress Credit account details" + creditAccountDetails);

        List<AccountDetails> creditAccountDetailsNormal = new ArrayList<>();
        for (int i = 0; i < fullAccount.accountDetails.size(); i++) {
            if (fullAccount.accountDetails.get(i).type.equals("c")) {
                creditAccountDetailsNormal.add(fullAccount.accountDetails.get(i));
                System.out.println("Normal loop details---" + creditAccountDetailsNormal);
            }
        }

    }
}
