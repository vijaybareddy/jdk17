package creditCard;

public class  CreditCard {
    public String cardNumber;
    public String cardHolderName;
    public String cvv;
    public String cardExpriyDate;

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cvv='" + cvv + '\'' +
                ", cardExpriyDate='" + cardExpriyDate + '\'' +
                '}';
    }
}
