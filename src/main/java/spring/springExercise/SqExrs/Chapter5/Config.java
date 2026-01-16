package spring.springExercise.SqExrs.Chapter5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    CommentSerice commentSerice(){
        return new CommentSerice();
    }
}
