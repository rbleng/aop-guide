package com.gittoy.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ArgsAspectConfig
 * Create By GaoYu 2017/10/20 14:59
 */
@Aspect
@Component
public class ArgsAspectConfig {

    @Pointcut("args(Long,..) && within(com.gittoy.aop.service.*)")
    public void matchArgs() {
    }

    @Before("matchArgs()")
    public void before() {
        System.out.println("");
        System.out.println("###before");
    }
}

/*===============================================================================

※匹配参数：

1，匹配任何以find开头而且只有一个Long参数的方法
    @Pointcut("execution(* *..find*(Long))")
    public void argsDemo1(){}

2，匹配任何只有一个Long参数的方法
    @Pointcut("args(Long)")
    public void argsDemo2(){}

3，匹配任何以find开头的而且第一个参数为Long型的方法
    @Pointcut("execution(**..find*(Long,..)")

4，匹配第一个参数为Long型的方法
    @Pointcut("args(Long,..)")
    public void argsDemo4(){}

 ===============================================================================*/
