package com.liangwei.learnspring.aop;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志拦截器
 * Created by liangwei on 2017/3/21.
 */
public class ServiceInterceptor {




    public Object serviceInterceptor(ProceedingJoinPoint proceedingJoinPoint){

        System.out.println("记录开始时间");
        Object result = null;
        try {
           result =  proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("记录结束时间，并计算时间间隔");
        System.out.println("将返回结果写入日志，并将该服务消耗时间写入日志");
        return result;
    }
}
