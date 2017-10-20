package com.gittoy.aop.service.sub;

import com.gittoy.aop.service.ProductService;
import org.springframework.stereotype.Component;

/**
 * SubService
 * Create By GaoYu 2017/10/20 11:02
 */
@Component
public class SubService extends ProductService {
    public void demo() {
        System.out.println("SubService.demo()");
    }
}
