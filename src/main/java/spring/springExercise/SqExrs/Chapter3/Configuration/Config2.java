package spring.springExercise.SqExrs.Chapter3.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springExercise.SqExrs.Chapter3.Bean.Parrot;
import spring.springExercise.SqExrs.Chapter3.Bean.Parrot2;
import spring.springExercise.SqExrs.Chapter3.Bean.Person2;

@Configuration
public class Config2 {

    @Bean(name = "parrot2")
    public Parrot2 parrot2(){
        Parrot2 p=new Parrot2();
        p.setName("Parrot2");
        return p;
    }

    @Bean(name = "person2")
    public Person2 person2(){
        Person2 p2=new Person2();
        p2.setName("Alexbek");
        p2.setParrot(parrot2());
        return p2;
    }

}
