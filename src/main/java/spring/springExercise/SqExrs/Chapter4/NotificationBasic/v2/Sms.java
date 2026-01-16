package spring.springExercise.SqExrs.Chapter4.NotificationBasic.v2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Sms implements Notification{
    @Override
    public void sendMassage() {
        System.out.println("Sms massage sent!");
    }
}
