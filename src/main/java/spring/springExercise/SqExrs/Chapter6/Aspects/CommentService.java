package spring.springExercise.SqExrs.Chapter6.Aspects;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    public void publish(Comment comment){
        System.out.println("Published: "+comment.getText());
    }
}
