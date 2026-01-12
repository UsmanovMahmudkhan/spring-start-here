package spring.springExercise.Playground.Config;


import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.springExercise.Playground.Bean.Car;
import spring.springExercise.Playground.Bean.Comment;
import spring.springExercise.Playground.Bean.Parrot;

@Configuration
@ComponentScan(basePackages = "spring.springExercise.Playground")
public class ConfigApp {

    @Bean
    public  Parrot parrot(){
        return new Parrot("kook");
    }


    @Bean
    public Car car(){
        return new Car("mers",22012);
    }

    @Bean
    public String name(){
        return "khan";
    }

    @Bean
    public Integer age(){
        return 21;
    }

    @Bean(value = "secondParrot")
    public Parrot parrot1(){
        return new Parrot("seond koko");
    }

}
