package newswiggy;

public interface Payment {
    void makePayment(double amount) throws CheckedException;
}

