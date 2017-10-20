package com.gittoy.aop.anno;

import java.lang.annotation.*;

/**
 * NeedSecured
 * Create By GaoYu 2017/10/20 16:36
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface NeedSecured {
}
