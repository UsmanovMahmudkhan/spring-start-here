package spring.springExercise.SqExrs.Chapter3.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springExercise.SqExrs.Chapter3.Bean.Parrot3;
import spring.springExercise.SqExrs.Chapter3.Bean.Person3;

@Configuration
public class Config3 {

    @Bean(name = "parrot")
    public Parrot3 parrot3(){
        Parrot3 parrot3=new Parrot3();
        parrot3.setName("Parrotbek");
        return parrot3;
    }

    @Bean(name = "person")
    public Person3 p3(Parrot3 parrot3){
        Person3 p3=new Person3();
        p3.setName("Alexjon");
        p3.setParrot3(parrot3);
        return p3;
    }
}
