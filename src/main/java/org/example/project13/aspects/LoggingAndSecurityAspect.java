package org.example.project13.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка получения книги/журнала");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав для получения книги/журнала");
    }
}
