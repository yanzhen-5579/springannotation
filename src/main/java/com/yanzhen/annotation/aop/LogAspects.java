package com.yanzhen.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {

    @Pointcut("execution( public int com.yanzhen.annotation.aop.MathCalculator.*(..))")
    public void pointCut(){}

    @Before("com.yanzhen.annotation.aop.LogAspects.pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"除法运行，参数列表是{"+ Arrays.asList(joinPoint.getArgs())+"}");
    }
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"除法结束");
    }
    //joinpoint 要在参数第一个
    @AfterReturning(value = "pointCut()",returning = "returning")
    public void logReturn(JoinPoint joinPoint,Object returning){
        System.out.println(joinPoint.getSignature().getName()+"除法正常结束，结果是{"+returning+"}");
    }
    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void logException(JoinPoint joinPoint,Exception e){
        System.out.println(joinPoint.getSignature().getName()+"除法异常，信息{"+e+"}");
    }
}
