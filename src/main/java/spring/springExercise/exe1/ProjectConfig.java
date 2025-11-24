package spring.springExercise.exe1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Product parrot() {
        var p = new Product();
        p.name="kaka0";
        return p;
    }
    @Bean
    String hello() {
        return "Hello";
    }
    @Bean
    Integer ten() {
        return 10;
    }

    @Bean
    Car car1(){
        return new Car("bmw",2001);
    }

    @Bean
    Car car2(){
        return new Car("Mers",200);
    }

    @Bean(name = "lambo")
    Car car3(){
        return new Car("damas",200);
    }

    @Bean
    Car car4(){
        return new Car("BMW",2022);
    }


}