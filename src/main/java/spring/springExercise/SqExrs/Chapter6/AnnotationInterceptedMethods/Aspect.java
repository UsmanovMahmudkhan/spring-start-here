package spring.springExercise.SqExrs.Chapter6.AnnotationInterceptedMethods;

import org.apache.commons.logging.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    private Logger logger= Logger.getLogger(Aspect.class.getName());

    @Around("@annotation(MyLog)")
    public Object show(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName=joinPoint.getSignature().getName();
        logger.info("MethodName: "+methodName);

        Object [] args=joinPoint.getArgs();
        logger.info("Arguments: "+ Arrays.asList(args));

        Object result=joinPoint.proceed();
        logger.info("Result: "+result);

        return  result;
    }
}
