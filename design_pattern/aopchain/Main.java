package com.y2019.m05.aopchain;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangweilong on 2019/05/30
 *
 * @author zhangweilong@corp.netease.com
 * @since 2019/05/30
 */
public class Main {
    public static void main(String[] args) throws Throwable {
        List<MethodInterceptor> chain = new ArrayList<>();
        //拦截器链，穿插着 放入 前置 和 后置 拦截器 。
        chain.add(new AfterMethodInterceptor("1"));
        chain.add(new BeforMethodInterceptor("1"));
        chain.add(new AfterMethodInterceptor("2"));
        chain.add(new BeforMethodInterceptor("2"));
        chain.add(new AfterMethodInterceptor("3"));
        chain.add(new BeforMethodInterceptor("3"));
        //目标对象
        TargetObj targetObj = new TargetObj();
        //目标方法
        Method method = TargetObj.class.getMethod("targetMethod");
        DefaultMethodInvacation defaultMethodInvacation = new DefaultMethodInvacation(chain, targetObj, method, null);
        //执行拦截器链
        defaultMethodInvacation.process();
    }
}
