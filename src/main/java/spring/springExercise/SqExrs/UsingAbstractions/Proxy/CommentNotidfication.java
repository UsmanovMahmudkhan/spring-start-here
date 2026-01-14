package spring.springExercise.SqExrs.UsingAbstractions.Proxy;

import spring.springExercise.SqExrs.UsingAbstractions.Model.Comment;
import spring.springExercise.SqExrs.UsingAbstractions.Service.CommentNotificationProxyServive;

public class CommentNotidfication implements CommentNotificationProxyServive {
    @Override
    public void sendNotification(Comment comment) {
        System.out.println("Send to + "+comment.getName());
    }
}
