package spring.springExercise.SqExrs.Chapter4.Proxy;

import spring.springExercise.SqExrs.Chapter4.Model.Comment;
import spring.springExercise.SqExrs.Chapter4.Service.CommentNotificationProxyServive;

public class CommentNotidfication implements CommentNotificationProxyServive {
    @Override
    public void sendNotification(Comment comment) {
        System.out.println("Send to + "+comment.getName());
    }
}
