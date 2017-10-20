package com.gittoy.aop.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

/**
 * AdviceAspectConfig
 * Create by GaoYu 2017/10/20 19:45
 */
public class AdviceAspectConfig {

    /************Pointcut************/
    @Pointcut("@annotation(com.gittoy.aop.anno.AdminOnly) && within(com.gittoy.aop..*)")
    public void matchAnno() {
    }

    @Pointcut("execution(* *..find*(Long)) && within(com.gittoy.aop..*)")
    public void matchLongArg() {
    }

    @Pointcut("execution(public * com.gittoy.aop.service..*Service.*(..) throws java.lang.IllegalAccessException) && within(com.gittoy.aop..*)")
    public void matchExecption() {
    }

    @Pointcut("execution(String com.gittoy.aop..*.*(..)) && within(com.gittoy.aop..*)")
    public void matchReturn() {
    }

    /************advice************/
    @After("matchAnno()")
    public void after() {
        System.out.println("");
        System.out.println("###after");
    }
}
