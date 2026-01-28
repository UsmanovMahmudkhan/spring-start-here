package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.OrderService.src.main.java.order_service.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.PaymentService.src.main.java.payment_service.payment_service.PaymentDTO;

@RestController
public class Controller {

    public OrderProxy proxy;

    public Controller(OrderProxy proxy) {
        this.proxy = proxy;
    }

    @PostMapping("/order")
    public PaymentDTO order(
                       @RequestBody PaymentDTO order){
        return proxy.makePayment(order);
    }
}
