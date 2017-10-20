package com.gittoy.aop.security;

/**
 * CurrentUserHolder：模拟用户切换
 *
 * Create by GaoYu 2017/10/19 20:21
 */
public class CurrentUserHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get() {
        return holder.get() == null ? "unknown" : holder.get();
    }

    public static void set(String user) {
        holder.set(user);
    }
}
