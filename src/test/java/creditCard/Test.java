package creditCard;



public class Test {
    public static void main(String[] args) {

        User user = new User();
        Address userAddress = new Address();
        userAddress.area = "mellcheruvu";
        userAddress.city = "kodad";
        userAddress.flotNo = "3-187";
        userAddress.pinCode = "508246";


        user.name = "VIJAY";
        user.address = userAddress;
        user.adharNumber = "1234 5678 0987";
        user.panNumber = "ESPB0956D";


        CardService cardService = new CardService();
        CreditCard card = cardService.createCard(cardService.createAccount(user));
        System.out.println(card);

        Loan loan = cardService.createLoan(user);
        System.out.println(loan.loanAmount);
    }
}