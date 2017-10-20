package com.gittoy.aop.security;

import com.gittoy.aop.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * SecurityAspect
 * Create by GaoYu 2017/10/19 21:17
 */
@Aspect
@Component
public class SecurityAspect {

    @Autowired
    AuthService authService;

    @Pointcut("@annotation(com.gittoy.aop.anno.AdminOnly)")
    public void adminOnly() {

    }

    @Before("adminOnly()")
    public void check() {
        authService.checkAccess();
    }
}
/*===============================================================================

1，AspectJ注解：
    1）@Aspect：用来标注说明JAVA类是切面配置类，这个类由Pointcut和Advice两部分组成。
    2）@Pointcut：由Pointcut Expression来表达的，用来描述哪些类的哪些方法进行织入代码。
    3）Advice：想要在这些方法的哪些时机进行织入的，比如在执行之前，或者执行之后等，共5种。

2，Pointcut Expression 切面表达式。
    1）designators 指示器 描述通过什么样的方式去匹配JAVA类的哪些方法
        ⑴ 匹配方法：execution() 重点掌握
        ⑵ 匹配注解：@target() @args() @within() @annotation()
        ⑶ 匹配包/类型：within()
        ⑷ 匹配对象：this(); bean(); target()
        ⑸ 匹配参数：args()
    2）wildcards 通配符
        ⑴ * 匹配任意数量的字符；
        ⑵ + 匹配指定类及其子类；
        ⑶ .. 一般用于匹配任意数的子包或参数。
    3）operators 运算符 && 与 || 或 ! 非

3，5种Advice注解
    1）Before 前置通知；
    2）After(finally) 后置通知，方法执行完之后
    3）AfterReturning 返回通知，成功执行完之后
    4）AfterThrowing 异常通知，抛出异常之后
    5）Around 环绕通知

 ===============================================================================*/