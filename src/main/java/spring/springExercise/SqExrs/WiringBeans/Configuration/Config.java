package spring.springExercise.SqExrs.WiringBeans.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springExercise.SqExrs.WiringBeans.Bean.*;

@Configuration
public class Config {

    @Bean
    public Parrot p(){
        Parrot p=new Parrot();
        p.setName("Chapter 3 Parrot");
        return p;
    }

    @Bean
    public Person person(){
        Person p=new Person();
        p.setName("Alex");
        return p;
    }
}
