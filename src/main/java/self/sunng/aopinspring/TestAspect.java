package self.sunng.aopinspring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by sunxiaodong on 2016/11/7.
 */
@Component("testAspect")
@Aspect
public class TestAspect {

    @Pointcut("execution(public void self.sunng..*.*Target*.te*(..))")
    public void pointcut() {
    }

    @Before(value = "pointcut()")
    public void beforeAdvice() {
        System.out.println("beforeAdvice @Before...");
    }

    @AfterReturning(value = "pointcut()")
    public void afterReturningAdvice() {
        System.out.println("afterReturningAdvice @AfterReturning...");
    }

    @After(value = "pointcut()")
    public void afterAdvice() {
        System.out.println("afterAdvice @After...");
    }

    @Around(value = "pointcut()")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundAdvice @Around - before");
        pjp.proceed();
        System.out.println("aroundAdvice @Around - after");
    }
}
