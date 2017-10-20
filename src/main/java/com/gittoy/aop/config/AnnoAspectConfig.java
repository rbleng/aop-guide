package com.gittoy.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * AnnoAspectConfig
 * Create By GaoYu 2017/10/20 15:29
 */
@Aspect
@Component
public class AnnoAspectConfig {

    // @Pointcut("@annotation(com.gittoy.aop.anno.AdminOnly)")
    @Pointcut("@within(com.gittoy.aop.anno.NeedSecured) && within(com.gittoy..*)")
    public void matchAnno() {
    }

    @Before("matchAnno()")
    public void before() {
        System.out.println("");
        System.out.println("###before");
    }
}

/*===============================================================================

※匹配注解：

1，匹配方法标注有AdminOnly的注解的方法
    @Pointcut("@annotation(com.gittoy.aop.secuity.AdminOnly)")
    public void annoDemo(){}

2，匹配标注有Beta的类底下的方法，要求的annotation的RetentionPolicy级别为CLASS
    @Pointcut("within(com.google.common.annotations.Beta)")
    public void annoWithinDemo(){}

3，匹配标注有Repository的类底下的方法，要求的annotation的RetentionPolicy级别为RUNTIME
    @Pointcut("target(org.springframework.stereotype.Repository)")
    public void annoTargetDemo

4，匹配传入的参数类标注有Repository注解的方法
    @Pointcut("@args(org.springframework.stereotype.Repository)")
    public void annoArgsDemo(){}

 ===============================================================================*/