package spring.springExercise.SqExrs.UsingAbstractions.v2.Repository;

import org.springframework.stereotype.Repository;
import spring.springExercise.SqExrs.UsingAbstractions.v2.Model.Comment;
import spring.springExercise.SqExrs.UsingAbstractions.v2.Service.EmailNotification;

@Repository
public class DBEmailRepo implements EmailNotification {
    @Override
    public void sendEmail(Comment comment) {
        System.out.println("Email massage send: "+comment.getText());
    }
}
