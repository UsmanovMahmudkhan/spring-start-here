package spring.springExercise.SqExrs.SpringAOC.Aspects;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    public void publish(Comment comment){
        System.out.println("Published: "+comment.getText());
    }
}
