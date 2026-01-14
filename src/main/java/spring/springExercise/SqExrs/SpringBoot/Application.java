package spring.springExercise.SqExrs.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring.springExercise.SqExrs.Chapter8")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
