package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.ProductService.src.main.java.com.ProfileService.productService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.ProductService.src.main.java.com.ProfileService.productService")
public class ProductServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.location",
				"file:src/main/java/spring/springExercise/SqExrs/ConsumingRestEndoints/OpenFeign/ProductServiceCall/ProductService/src/main/resources/application.properties");
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
