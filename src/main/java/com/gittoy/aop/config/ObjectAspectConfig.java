package com.gittoy.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ObjectAspectConfig
 * Create By GaoYu 2017/10/20 14:12
 */
@Aspect
@Component
public class ObjectAspectConfig {

    @Pointcut("target(com.gittoy.aop.log.Loggable)")
    public void matchCondition() {
    }

    @Before("matchCondition()")
    public void before() {
        System.out.println("");
        System.out.println("###before");
    }
}

/*===============================================================================

※匹配对象：
    public class DemoDao implements IDao {}

1，this()：
    匹配AOP对象的目标对象为指定类型的方法，即DemoDao的AOP代理对象的方法
    @Pointcut("this(com.gittoy.aop.DemoDao)")
    public void thisDemo() {}
    可以拦截 DeclareParents(Introduction)

2，target()：
    匹配实现IDao接口的目标对象（而不是aop代理后的对象）的方法，这里即DemoDao的方法
    @Pointcut("target(com.gittoy.aop.IDao)")
    public void targetDemo() {}
    不拦截 DeclareParents(Introduction)

3，bean()：
    匹配所有以Service结尾的bean里头的方法
    @Pointcut("bean(*Service)")
    public void beanDemo() {}

 ===============================================================================*/