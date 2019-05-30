package com.y2019.m05.aopchain;

/**
 * Created by zhangweilong on 2019/05/30
 *
 * @author zhangweilong@corp.netease.com
 * @since 2019/05/30
 */
public class BeforMethodInterceptor implements MethodInterceptor {
    String identification;
    public BeforMethodInterceptor(String identification){
        this.identification = identification;
    }
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("执行前置通知"+identification);
        return mi.process();
    }
}
