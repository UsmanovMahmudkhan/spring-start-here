package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.UserService.src.main.java.com.UserService.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication (scanBasePackages = "spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.UserService.src.main.java.com.UserService.UserService")
@EnableFeignClients
public class UserServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.location","file:src/main/java/spring/springExercise/SqExrs/ConsumingRestEndoints/OpenFeign/ProductServiceCall/UserService/src/main/resources/application.properties");
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
