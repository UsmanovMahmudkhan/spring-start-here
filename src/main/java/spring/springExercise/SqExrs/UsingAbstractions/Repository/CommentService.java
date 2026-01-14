package spring.springExercise.SqExrs.UsingAbstractions.Repository;

import spring.springExercise.SqExrs.UsingAbstractions.Model.Comment;
import spring.springExercise.SqExrs.UsingAbstractions.Proxy.CommentNotidfication;

public class CommentService {
    private DBCommentSave dbCommentSave;
    private CommentNotidfication notidfication;

    public CommentService(DBCommentSave dbCommentSave, CommentNotidfication notidfication) {
        this.dbCommentSave = dbCommentSave;
        this.notidfication = notidfication;
    }

    public void publish(Comment comment){
        dbCommentSave.comment_save(comment);
        notidfication.sendNotification(comment);
    }
}
