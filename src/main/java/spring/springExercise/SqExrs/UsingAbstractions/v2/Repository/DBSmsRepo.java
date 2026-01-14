package spring.springExercise.SqExrs.UsingAbstractions.v2.Repository;

import org.springframework.stereotype.Repository;
import spring.springExercise.SqExrs.UsingAbstractions.v2.Model.Comment;
import spring.springExercise.SqExrs.UsingAbstractions.v2.Service.SmsNotification;

@Repository
public class DBSmsRepo implements SmsNotification {

    @Override
    public void sendSms(Comment comment) {
        System.out.println("Sms sent to "+comment.getOwner());
    }
}
