package spring.springExercise.SqExrs.Chapter6.Aspects;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "spring.springExercise.SqExrs.Chapter6.Aspects")
@EnableAspectJAutoProxy
public class Config {
}
