package spring.springExercise.exe2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring.springExercise.exe2")
public class Config {

    @Bean
    public Student student() {
        return new Student("Alex", 22);
    }
}