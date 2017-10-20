package com.gittoy.aop.service;

import com.gittoy.aop.security.CurrentUserHolder;
import org.springframework.stereotype.Component;

/**
 * AuthService
 * Create by GaoYu 2017/10/19 20:36
 */
@Component
public class AuthService {

    public void checkAccess() {
        String user = CurrentUserHolder.get();
        if(!"admin".equals(user)) {
            throw new RuntimeException("operation now allow");
        }
    }
}
