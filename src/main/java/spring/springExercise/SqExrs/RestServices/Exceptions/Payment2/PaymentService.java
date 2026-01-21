package spring.springExercise.SqExrs.RestServices.Exceptions.Payment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean check_balance(Payment payment){
        if(payment.getMoney()==2){
            throw new NotEnoughMoneyException();
        }
        return true;

    }
}
