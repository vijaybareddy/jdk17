package creditCard;

public class Loan {
    public String panCard;
    public String duration;
    public long loanAmount;
    public String panNumber;

    @Override
    public String toString() {
        return "Loan{" +
                "panCard='" + panCard + '\'' +
                ", duration='" + duration + '\'' +
                ", loanAmount=" + loanAmount +
                ", panNumber='" + panNumber + '\'' +
                '}';
    }
}
