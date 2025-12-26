package spring.springExercise.SqExrs.Chapter3.Configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.springExercise.SqExrs.Chapter3.Bean.Parrot;

@Configuration
public class Config5 {

    @Bean
    @Primary
    public Parrot p(){
        return new Parrot("parrot-1");
    }

    @Bean
    public Parrot p2(){
        return new Parrot("parrot-2");
    }

    @Bean
    public Parrot p3(){
        return new Parrot("parrot-3");
    }
}
