package spring.springExercise.SqExrs.RestServices.Exceptions.Payment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    public PaymentService service;

    @PostMapping("/")
}
