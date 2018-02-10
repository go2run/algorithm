package com.arelikebrothers.learn.algorithm.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
public class TimeCostLogAspect {

    @Pointcut("@annotation(com.arelikebrothers.learn.algorithm.aop.annotation.TimeCostLog)")
    public void pointCut(){}

    @Around("pointCut()")
    public void calculate(ProceedingJoinPoint proceedingJoinPoint) {
        long start = System.currentTimeMillis();
        try {
            System.out.println("Going to call the method.");
            proceedingJoinPoint.proceed();
            System.out.println("Method execution completed.");
        } catch (Throwable throwable) {
            System.err.println(throwable.getMessage());
        }

        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
    }

    @Before("@annotation(com.arelikebrothers.learn.algorithm.aop.annotation.TimeCostLog)")
    public void before(JoinPoint joinPoint){
        MethodSignature sign =  (MethodSignature)joinPoint.getSignature();
        Method method = sign.getMethod();
        System.out.print("接受方法："+method.getName()+" 前置日志");
    }

}
