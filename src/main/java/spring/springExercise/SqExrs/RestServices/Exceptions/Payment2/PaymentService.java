package spring.springExercise.SqExrs.RestServices.Exceptions.Payment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment check_balance(Payment payment){
        throw new NotEnoughMoneyException();
    }
}
