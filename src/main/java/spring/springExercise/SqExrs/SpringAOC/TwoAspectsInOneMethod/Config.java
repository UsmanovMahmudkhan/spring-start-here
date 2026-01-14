package spring.springExercise.SqExrs.SpringAOC.TwoAspectsInOneMethod;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "spring.springExercise.SqExrs.Chapter6.TwoAspectsInOneMethod")
public class Config {
}
