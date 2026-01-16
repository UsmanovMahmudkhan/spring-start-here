package spring.springExercise.SqExrs.Chapter4.Service;

import spring.springExercise.SqExrs.Chapter4.Model.Comment;

public interface CommentNotificationProxyServive {
    void sendNotification(Comment comment);
}
