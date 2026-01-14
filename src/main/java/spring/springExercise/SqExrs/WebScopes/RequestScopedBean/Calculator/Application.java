package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring.springExercise.SqExrs.WebScopes.RequestScopedBean.Calculator")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
