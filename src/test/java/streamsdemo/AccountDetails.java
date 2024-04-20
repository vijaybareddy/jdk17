package streamsdemo;

import java.util.Date;

public class AccountDetails {
    Date txDate;
   Date valueDate;
   double amount;
    String description;

String type;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "txDate=" + txDate +
                ", valueDate=" + valueDate +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
