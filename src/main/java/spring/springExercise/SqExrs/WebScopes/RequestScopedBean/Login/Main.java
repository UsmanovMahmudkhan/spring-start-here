package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.Login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring.springExercise.SqExrs.Chapter9.RequestScopedBean")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
