package spring.springExercise.SqExrs.Chapter4.Repository;

import spring.springExercise.SqExrs.Chapter4.Model.Comment;
import spring.springExercise.SqExrs.Chapter4.Service.CommentSave;

public class DBCommentSave implements CommentSave {

    @Override
    public void comment_save(Comment comment) {
        System.out.println("Saved: "+comment.getText());
    }
}
