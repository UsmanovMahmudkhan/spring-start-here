package spring.springExercise.SqExrs.UsingAbstractions.v2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.springExercise.SqExrs.UsingAbstractions.v2.Model.Comment;
import spring.springExercise.SqExrs.UsingAbstractions.v2.Repository.DBEmailRepo;
import spring.springExercise.SqExrs.UsingAbstractions.v2.Repository.DBSmsRepo;

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
