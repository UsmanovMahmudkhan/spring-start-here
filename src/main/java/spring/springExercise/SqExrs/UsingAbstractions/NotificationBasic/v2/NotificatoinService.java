package spring.springExercise.SqExrs.UsingAbstractions.NotificationBasic.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificatoinService {

    @Autowired
    private Email email;
    @Autowired
    private Sms sms;

    public void start(){
        email.sendMassage();
        sms.sendMassage();
    }
}
