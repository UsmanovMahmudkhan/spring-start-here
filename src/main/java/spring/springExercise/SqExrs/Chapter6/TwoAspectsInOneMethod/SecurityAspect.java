package spring.springExercise.SqExrs.Chapter6.TwoAspectsInOneMethod;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;
@Aspect
@Order(1)
@Component
public class SecurityAspect {

    private final static Logger log=Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(MyLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String method=joinPoint.getSignature().getName();
        Object[] args=joinPoint.getArgs();
        log.info("Before Security");
        Object result=joinPoint.proceed();
        log.info("Security:   ---->> Method: "+method+" Argument: "+ Arrays.asList(args)+" result: "+result);

        log.info("After Security");
        return  result;
    }
}
