package spring.springExercise.SqExrs.UsingAbstractions.Model;

import spring.springExercise.SqExrs.UsingAbstractions.Proxy.CommentNotidfication;
import spring.springExercise.SqExrs.UsingAbstractions.Repository.CommentService;
import spring.springExercise.SqExrs.UsingAbstractions.Repository.DBCommentSave;

public class Main {

    public static void main(String[] args) {
        Comment comment=new Comment("Salom","Ali");

        DBCommentSave dbsave=new DBCommentSave();

        CommentNotidfication notidfication=new CommentNotidfication();

        CommentService service=new CommentService(dbsave,notidfication);

        service.publish(comment);

    }
}
