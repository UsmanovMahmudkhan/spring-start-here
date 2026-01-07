package spring.springExercise.SqExrs.Chapter6.InterceptedMethodParameter;

import java.util.logging.Logger;

@org.springframework.stereotype.Service
public class Service {

    public String publish(Comment comment){
        System.out.println("Published: "+comment.getText());
        return "Success";
    }
}
