package spring.springExercise.SqExrs.UsingAbstractions.v2.Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring.springExercise.SqExrs.Chapter4.v2.Repository", "spring.springExercise.SqExrs.Chapter4.v2.Service"})
public class ProjectCOnfig {

}
