package streamsdemo;

import java.util.List;
import java.util.Objects;

public class Account {
    String accountNumber;
    double balance;
    String ifscCode;
    Address address;
    User user;
    List<AccountDetails>accountDetails;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Account account = (Account) object;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
