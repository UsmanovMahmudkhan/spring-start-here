package spring.springExercise.SqExrs.BeanScopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    CommentSerice commentSerice(){
        return new CommentSerice();
    }
}
