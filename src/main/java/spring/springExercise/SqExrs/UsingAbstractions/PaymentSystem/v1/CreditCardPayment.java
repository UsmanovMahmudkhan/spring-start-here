package spring.springExercise.SqExrs.UsingAbstractions.PaymentSystem.v1;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment {
    double balance;

    public CreditCardPayment(double balance) {
        this.balance = balance;
    }

    public CreditCardPayment() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "balance=" + balance +
                '}';
    }
}
