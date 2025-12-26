package spring.springExercise.Practice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springExercise.Practice.Bean.Car2;
import spring.springExercise.Practice.Bean.Owner;
import spring.springExercise.Practice.Bean.Owner2;

@Configuration
public class Ex2Config {

    @Bean(name = "car2")
    public Car2 car(){
        return new Car2("Lambo");
    }
    @Bean(name="owner2")
    public Owner2 owner(Car2 car){
        return new Owner2("Alijon",car());
    }
}
