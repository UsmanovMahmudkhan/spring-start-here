package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.OrderService.src.main.java.order_service.order_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.PaymentService.src.main.java.payment_service.payment_service.PaymentDTO;

@FeignClient(name = "PaymentService", url = "http://localhost:8080")
public interface OrderProxy {

    @PostMapping("/payment/pay")
    PaymentDTO makePayment(@RequestBody PaymentDTO order);
}
