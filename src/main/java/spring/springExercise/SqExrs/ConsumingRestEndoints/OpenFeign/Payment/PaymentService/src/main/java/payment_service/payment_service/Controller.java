package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.PaymentService.src.main.java.payment_service.payment_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/payment/pay")
    public ResponseEntity<PaymentDTO>paymentDTOResponseEntity(
            @RequestBody PaymentDTO paymentDTO
    ){
        return ResponseEntity.ok(paymentDTO);
    }
}
