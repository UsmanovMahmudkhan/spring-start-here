package spring.springExercise.SqExrs.Chapter6.NO_Aspects;

import java.util.logging.Logger;

@org.springframework.stereotype.Service
public class Service {

    private Logger logger=Logger.getLogger(Service.class.getName());

    public void publish(Comment comment){
        logger.warning("Published comment: "+comment.getText());
    }
}
