package spring.springExercise.SqExrs.RestServices.Exceptions;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDTO payment(){
        throw  new NotEnoughMoney();
    }
}
