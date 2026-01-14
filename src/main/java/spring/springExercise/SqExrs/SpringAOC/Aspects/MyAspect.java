package spring.springExercise.SqExrs.SpringAOC.Aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class MyAspect {

    private static final Logger logger = Logger.getLogger(MyAspect.class.getName());

    @Around("execution(* spring.springExercise.SqExrs.Chapter6.Aspects..*(..))")
    public void show(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Before");

        joinPoint.proceed();

        logger.info("After finished");

    }
}
