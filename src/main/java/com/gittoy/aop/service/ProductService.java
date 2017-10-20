package com.gittoy.aop.service;

import com.gittoy.aop.anno.NeedSecured;
import org.springframework.stereotype.Component;

/**
 * ProductService
 * Create By GaoYu 2017/10/20 8:36
 */
@Component
@NeedSecured
public class ProductService {

    public String getName() {
        System.out.println("ProductService.getName()");
        return "ProductService";
    }

    public void exDemo() throws IllegalAccessException {
        System.out.println("ProductService.exDemo()");
        throw new IllegalAccessException("TEST");
    }

    public void findById(Long id) {
        System.out.println("ProductService.findById(Long id)");
    }

    public void findByTwoArgs(Long id, String name) {
        System.out.println("ProductService.findByTwoArgs(Long id, String name)");
    }

    public void log() {
        System.out.println("ProductService.log()");
    }
}

/*===============================================================================

1，编程范式概览：
    1）面向过程编程；2）面向对象编程；3）函数式编程；4）事件驱动编程；5）面向切面编程。

2，AOP是什么？
    1）是一种编程范式，不是编程语言；
    2）解决特定问题，不能解决所有问题；
    3）是OOP的补充，不是替代。

3，AOP的初衷：
    1）代码重复性问题；
    2）关注点分离：
        ⑴ 水平分离：展示层 -> 服务层 -> 持久层；
        ⑵ 垂直分离：模块划分（订单、库存等）；
        ⑶ 切面分离：分离功能性需求与非公能性需求。

4，使用AOP的好处：
    1）集中处理某一关注点/横切逻辑；
    2）可以很方便的添加/删除关注点；
    3）侵入性少，增强代码可读性及可维护性。

5，AOP的应用场景：
    权限控制；缓存控制；事务控制；审计日志；性能监控；分布式追踪；异常处理。

6，支持AOP的编程语言：
    JAVA、.NET、C/C++、Ruby、Python、PHP……

7，织入的时机
    1）编译时 AspectJ
    2）类加载时 AspectJ 5+
    3）运行时 Spring AOP 通过代理对象实现运行时织入

 ===============================================================================*/
