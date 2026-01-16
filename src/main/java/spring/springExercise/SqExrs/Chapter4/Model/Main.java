package spring.springExercise.SqExrs.Chapter4.Model;

import spring.springExercise.SqExrs.Chapter4.Proxy.CommentNotidfication;
import spring.springExercise.SqExrs.Chapter4.Repository.CommentService;
import spring.springExercise.SqExrs.Chapter4.Repository.DBCommentSave;

public class Main {

    public static void main(String[] args) {
        Comment comment=new Comment("Salom","Ali");

        DBCommentSave dbsave=new DBCommentSave();

        CommentNotidfication notidfication=new CommentNotidfication();

        CommentService service=new CommentService(dbsave,notidfication);

        service.publish(comment);

    }
}
