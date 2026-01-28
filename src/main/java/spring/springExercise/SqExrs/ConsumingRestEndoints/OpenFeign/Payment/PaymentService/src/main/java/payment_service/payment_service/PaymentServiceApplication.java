package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.PaymentService.src.main.java.payment_service.payment_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.PaymentService.src.main.java.payment_service.payment_service")
public class PaymentServiceApplication {

	public static void main(String[] args) {

		//System.setProperty("spring.config.location",
			//	"file:src/main/java/spring/springExercise/SqExrs/ConsumingRestEndoints/OpenFeign/Payment/PaymentService/src/main/resources/application.properties");
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
