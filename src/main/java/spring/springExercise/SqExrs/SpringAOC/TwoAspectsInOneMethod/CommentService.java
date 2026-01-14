package spring.springExercise.SqExrs.SpringAOC.TwoAspectsInOneMethod;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @MyLog
    public String publish(Comment comment){
        System.out.println("Published: "+comment.getText());
        return "Success";
    }
}
