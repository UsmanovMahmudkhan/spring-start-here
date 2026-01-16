package spring.springExercise.SqExrs.Chapter4.v2.Service;

import spring.springExercise.SqExrs.Chapter4.v2.Model.Comment;

public interface EmailNotification {
    void sendEmail(Comment comment);
}
