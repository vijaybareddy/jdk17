package creditCard;

import Bank.Card;

import java.util.UUID;

public class CardService {

    public Account createAccount(User user) {
        Account account = new Account();
        Address address = new Address();
        address.area = "lb";
        address.city = "hyd";
        address.flotNo = "3/134";
        address.pinCode = "900035";


        account.accountName = user.name;
        account.accountNumber = UUID.randomUUID().toString();
        account.bankName = "SBI";
        account.ifcCode = "SBIN00986";
        account.bankAddress = address;
        account.useraddress = user.address;

        return account;
    }

   public CreditCard createCard(Account account) {
       CreditCard creditCard = new CreditCard();
       creditCard.cardHolderName = account.accountName;
       creditCard.cardNumber = "444444444";
       creditCard.cardExpriyDate = "22/7/2030";
       creditCard.cvv = "345";
       return creditCard;
   }
    public Loan createLoan(User user){
        Loan loan=new Loan();
        loan.loanAmount=100000;
        loan.duration="24 months";
        loan.panCard= user.panNumber;
        return loan;

    }
}
