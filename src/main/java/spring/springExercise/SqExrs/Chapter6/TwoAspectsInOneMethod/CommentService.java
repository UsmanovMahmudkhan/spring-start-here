package spring.springExercise.SqExrs.Chapter6.TwoAspectsInOneMethod;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @MyLog
    public String publish(Comment comment){
        System.out.println("Published: "+comment.getText());
        return "Success";
    }
}
