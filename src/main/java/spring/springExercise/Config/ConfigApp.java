package spring.springExercise.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import spring.springExercise.Bean.Car;
import spring.springExercise.Bean.Parrot;
import spring.springExercise.Bean.ParrotComponent;

@Configuration
@ComponentScan(basePackages = "spring.springExercise")
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
