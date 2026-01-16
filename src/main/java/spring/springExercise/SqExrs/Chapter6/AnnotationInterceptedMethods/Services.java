package spring.springExercise.SqExrs.Chapter6.AnnotationInterceptedMethods;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Services {
    private final static Logger log = Logger.getLogger(Services.class.getName());

    public void publishs(Comment comment){
        log.info("Publishing: "+comment.getText());
    }

    public void edit(String text){
        log.info("Editing: "+text);
    }

    @MyLog(massage = "used in delete() method")
    public  String delete(Comment comment){
        log.warning("Deleting: "+comment.getText());
        return "Deleted";
    }


}