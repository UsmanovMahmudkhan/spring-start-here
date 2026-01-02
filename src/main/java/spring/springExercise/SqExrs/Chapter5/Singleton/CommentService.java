package spring.springExercise.SqExrs.Chapter5.Singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommentService {

    @Bean(name = "Comment1")
    public Comment comment1(){
        return new Comment();
    }

    @Bean(name = "Comment2")
    public Comment comment2(){
        return new Comment();
    }
}
