package com.gittoy.aop.log;

import com.gittoy.aop.domain.Product;
import com.gittoy.aop.anno.AdminOnly;
import org.springframework.stereotype.Component;

/**
 * LogService
 * Create By GaoYu 2017/10/20 11:03
 */
@Component
public class LogService {

    @AdminOnly
    public void log() {
        System.out.println("LogService.log()");
    }

    public void annoArg(Product product){
        System.out.println("LogService.annoArg(Product)");
    }
}
