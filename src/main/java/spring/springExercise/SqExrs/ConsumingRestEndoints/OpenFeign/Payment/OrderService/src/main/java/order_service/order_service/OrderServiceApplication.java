package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.OrderService.src.main.java.order_service.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = "spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.OrderService.src.main.java.order_service.order_service")
public class OrderServiceApplication {

	public static void main(String[] args) {

		System.setProperty("spring.config.location",
				"file:src/main/java/spring/springExercise/SqExrs/ConsumingRestEndoints/OpenFeign/Payment/OrderService/src/main/resources/application.properties");
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
