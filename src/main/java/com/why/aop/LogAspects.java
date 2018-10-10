package com.why.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author wanghaoyu
 * @date 2018/8/31 - 13:37
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.why.aop.MathCalculator.*(..))")
    public void pointCut(){}
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"--->LogAspects...logStart..." + Arrays.asList(joinPoint.getArgs()));
    }
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"--->LogAspects...logEnd...");
    }
    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println(joinPoint.getSignature().getName()+"--->LogAspects...logReturn..."+ result);
    }
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception){
        System.out.println(joinPoint.getSignature().getName() + "LogAspects...logException..." + exception);
    }
}
