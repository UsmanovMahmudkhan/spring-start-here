package spring.springExercise.SqExrs.Chapter9.RequesScopedBean.Login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring.springExercise.SqExrs.Chapter9.RequesScopedBean")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
