package spring.springExercise.SqExrs.UsingAbstractions.NotificationBasic.v2;

import org.springframework.stereotype.Component;

@Component
public class Sms implements Notification{
    @Override
    public void sendMassage() {
        System.out.println("Sms massage sent!");
    }
}
