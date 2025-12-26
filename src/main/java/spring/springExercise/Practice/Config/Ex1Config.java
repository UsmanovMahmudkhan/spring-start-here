package spring.springExercise.Practice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springExercise.Practice.Bean.Car;
import spring.springExercise.Practice.Bean.Owner;

@Configuration
public class Ex1Config {

    @Bean(name = "mers")
    public Car car(){
        return new Car("Mers",2032,12.3);
    }

    @Bean(name="owner")
    public Owner owner(){
        return new Owner("Ali",21);
    }
}
