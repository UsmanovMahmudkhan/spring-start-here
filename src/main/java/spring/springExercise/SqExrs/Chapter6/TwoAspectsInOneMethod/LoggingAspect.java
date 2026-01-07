package spring.springExercise.SqExrs.Chapter6.TwoAspectsInOneMethod;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.springExercise.SqExrs.Chapter4.v2.Config.ProjectCOnfig;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(2)
@Component
public class LoggingAspect {
    private final static Logger log=Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(MyLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String method=joinPoint.getSignature().getName();
        Object[] args=joinPoint.getArgs();
        log.info("Before Logging");
        Object result=joinPoint.proceed();
        log.info("Logging:   ---->> Method: "+method+" Argument: "+ Arrays.asList(args)+" result: "+result);

        log.info("After Logging");
        return  result;
    }
}
