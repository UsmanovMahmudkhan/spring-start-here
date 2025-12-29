package spring.springExercise.SqExrs.Chapter4.v2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring.springExercise.SqExrs.Chapter4.v2.Model.Comment;
import spring.springExercise.SqExrs.Chapter4.v2.Repository.DBEmailRepo;
import spring.springExercise.SqExrs.Chapter4.v2.Repository.DBSmsRepo;

@Component()
public class CommentService {

    @Autowired
    private DBEmailRepo emailRepo;
    @Autowired
    private DBSmsRepo smsRepo;

    public void publish(Comment comment){
        emailRepo.sendEmail(comment);
        smsRepo.sendSms(comment);
    }
}
