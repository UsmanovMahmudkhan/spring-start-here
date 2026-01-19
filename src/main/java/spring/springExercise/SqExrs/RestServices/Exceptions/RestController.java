package spring.springExercise.SqExrs.RestServices.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private  PaymentService service;

    public RestController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/")
    public ResponseEntity<PaymentDTO>services(){
        var response=service.payment();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(response);
    }

}
