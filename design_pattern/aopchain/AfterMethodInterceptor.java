package com.y2019.m05.aopchain;

/**
 * Created by zhangweilong on 2019/05/30
 *
 * @author zhangweilong@corp.netease.com
 * @since 2019/05/30
 */
public class AfterMethodInterceptor implements MethodInterceptor {
    String identification;
    public AfterMethodInterceptor(String identification){
        this.identification = identification;
    }
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        try {
            return mi.process();
        }finally {
            System.out.println("执行后置通知"+identification);
        }
    }
}
