package com.gittoy.aop.service;


import com.gittoy.aop.domain.Product;
import com.gittoy.aop.log.LogService;
import com.gittoy.aop.security.CurrentUserHolder;
import com.gittoy.aop.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ProductServiceTest
 * Create By GaoYu 2017/10/20 8:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Autowired
    SubService subService;

    @Autowired
    LogService logService;

    @Test
    public void getNameTest() {
        System.out.println("###begin test###");
        productService.getName();
        productService.findById(1L);
        productService.findByTwoArgs(1L,"hello");
        productService.getName();
        subService.demo();
        try {
            productService.exDemo();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        CurrentUserHolder.set("admin");
        logService.log();
        productService.log();
        logService.annoArg(new Product());
        System.out.println("");
        System.out.println("###end test###");
    }
}