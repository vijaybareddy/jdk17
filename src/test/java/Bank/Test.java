package Bank;

public class Test {
    public static void main(String[] args) {
        Account account=new Account();
        account.AccountNo=1234;
        account.balance=10000;
        account.ifsc="SBIN0001763";
        account.userName="user1234";
        account.password=123456;

        Card card=new Card();
        card.account=account;
        card.cardNo="1234 5678 0985";
        card.cvv="334";
        card.exp=12/03/2030;


        AtmMachine atmMachine=new AtmMachine();
        atmMachine.machineId="34567545";
        atmMachine.atmBal=700000;
        atmMachine.location="MIYAPUR";

        Transaction transaction=new Transaction();
        transaction.atm=atmMachine;
        transaction.card=card;
        transaction.withdraw=2000;
        transaction.transactionId="121234345654";

        System.out.println();
    }
}
