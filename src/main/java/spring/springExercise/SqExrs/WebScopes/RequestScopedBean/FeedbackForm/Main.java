package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.FeedbackForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring.springExercise.SqExrs.Chapter9.RequestScopedBean.FeedbackForm")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
