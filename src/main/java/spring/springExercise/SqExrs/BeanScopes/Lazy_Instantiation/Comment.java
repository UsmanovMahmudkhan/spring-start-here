package spring.springExercise.SqExrs.BeanScopes.Lazy_Instantiation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Comment {

    public Comment() {
        System.out.println("Helloooo, comment is created");
    }

}
