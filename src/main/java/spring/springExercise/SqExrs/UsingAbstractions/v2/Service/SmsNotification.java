package spring.springExercise.SqExrs.UsingAbstractions.v2.Service;

import spring.springExercise.SqExrs.UsingAbstractions.v2.Model.Comment;

public interface SmsNotification {
    void sendSms(Comment comment);
}
