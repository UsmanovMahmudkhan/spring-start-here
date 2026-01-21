package spring.springExercise.SqExrs.RestServices.Exceptions.Payment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import spring.springExercise.SqExrs.RestServices.Exceptions.NotEnoughMoney;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    public PaymentService service;

    @PostMapping("/payment")
    public ResponseEntity<?>responseEntity(){
        try {
            service.check_balance(new Payment(3));
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(new Payment(3));
        } catch (NotEnoughMoneyException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorInfo("Not enough money for payment"));
        }



    }
}
