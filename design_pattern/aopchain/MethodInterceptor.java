package com.y2019.m05.aopchain;

/**
 * Created by zhangweilong on 2019/05/30
 *
 * @author zhangweilong@corp.netease.com
 * @since 2019/05/30
 *
 * 方法拦截器
 */
public interface MethodInterceptor {
    Object invoke(MethodInvocation mi) throws Throwable;
}
