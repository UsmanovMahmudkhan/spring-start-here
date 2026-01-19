package spring.springExercise.SqExrs.RestServices.Exceptions;

import org.springframework.stereotype.Component;

@Component
public class PaymentDTO {
    double amount;

    public PaymentDTO() {
    }

    public PaymentDTO(double amount) {

        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
