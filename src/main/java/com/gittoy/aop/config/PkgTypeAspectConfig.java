package com.gittoy.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * PkgTypeAspectConfig
 * Create By GaoYu 2017/10/20 10:40
 */
@Aspect
@Component
public class PkgTypeAspectConfig {

    @Pointcut("within(com.gittoy.aop..*)")
    public void mathType() {
    }

    @Before("mathType()")
    public void before() {
        System.out.println("");
        System.out.println("###before");
    }
}

/*===============================================================================

1，匹配ProductService类里头的所有方法
    @Pointcut("within(com.gittoy.aop.service.ProductService)")

2，匹配com.gittoy包及子包下所有类的方法
    @Pointcut("within(com.gittoy..*)")

 ===============================================================================*/