package spring.springExercise.SqExrs.SpringAOC.AnnotationInterceptedMethods;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "spring.springExercise.SqExrs.Chapter6.AnnotationInterceptedMethods")
@EnableAspectJAutoProxy
public class Config {
}
