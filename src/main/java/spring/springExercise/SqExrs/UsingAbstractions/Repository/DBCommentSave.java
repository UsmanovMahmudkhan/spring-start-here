package spring.springExercise.SqExrs.UsingAbstractions.Repository;

import spring.springExercise.SqExrs.UsingAbstractions.Model.Comment;
import spring.springExercise.SqExrs.UsingAbstractions.Service.CommentSave;

public class DBCommentSave implements CommentSave {

    @Override
    public void comment_save(Comment comment) {
        System.out.println("Saved: "+comment.getText());
    }
}
