package spring.springExercise.SqExrs.SpringAOC.InterceptedMethodParameter;

@org.springframework.stereotype.Service
public class Service {

    public String publish(Comment comment){
        System.out.println("Published: "+comment.getText());
        return "Success";
    }
}
