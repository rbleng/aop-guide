package com.gittoy.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ExecutionAspectConfig
 * Create by GaoYu 2017/10/20 19:18
 */
@Aspect
@Component
public class ExecutionAspectConfig {

    @Pointcut("execution(public void com.gittoy.aop.service.*service.*(..))")
    public void matchCondition() {}

    @Before("matchCondition()")
    public void before() {
        System.out.println("");
        System.out.println("###before");
    }
}

/*===============================================================================

※execution()

    execution(
        modifier-pattern? // 修饰符 可以省略
        ret-type-pattern // 返回值
        declaring-type-pattern? // 包名 可以省略
        name-pattern(param-pattern) // 方法名（方法参数）
        throws-pattern? // 方法抛出的异常 可以省略
    )

 ===============================================================================*/