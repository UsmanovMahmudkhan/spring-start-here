package spring.springExercise.SqExrs.Chapter5.Eager_Instantiation;

import org.springframework.stereotype.Component;

@Component
public class Comment
{
    String comment;

    public Comment(String comment) {
        this.comment = comment;
    }

    public Comment() {
        System.out.println("Comment created");
    }
}
