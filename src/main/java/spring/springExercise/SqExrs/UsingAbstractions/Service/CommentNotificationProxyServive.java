package spring.springExercise.SqExrs.UsingAbstractions.Service;

import spring.springExercise.SqExrs.UsingAbstractions.Model.Comment;

public interface CommentNotificationProxyServive {
    void sendNotification(Comment comment);
}
