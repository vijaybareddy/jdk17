package creditCard;

public class Account {
    public String bankName;
    public String accountName;
    public String accountNumber;

    public String ifcCode;

    public Address useraddress;
    public Address bankAddress;

    @Override
    public String toString() {
        return "Account{" +
                "bankName='" + bankName + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifcCode='" + ifcCode + '\'' +
                ", useraddress=" + useraddress +
                ", bankAddress=" + bankAddress +
                '}';
    }
}
