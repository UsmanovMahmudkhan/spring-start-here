package spring.springExercise.SqExrs.SpringAOC.InterceptedMethodParameter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    private final static Logger logger=Logger.getLogger(Aspect.class.getName());

    @Around("execution(* spring.springExercise.SqExrs.Chapter6.InterceptedMethodParameter..*(..))")
    public Object show(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName=joinPoint.getSignature().getName();
        Object[] args=joinPoint.getArgs();
        logger.info("Method name: "+methodName);
        logger.info("Arguments: "+ Arrays.asList(args));
        Object methodResult=joinPoint.proceed();
        logger.info("Method result: "+methodResult);
        return "Chaning Value";

    }
    }
