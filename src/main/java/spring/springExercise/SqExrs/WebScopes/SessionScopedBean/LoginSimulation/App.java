package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.LoginSimulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "spring.springExercise.SqExrs.WebScopes.SessionScopedBean.LoginSimulation")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
