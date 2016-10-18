package com.zhuangshiqi;

/**
 * Created by dezhonger on 2016/10/18.
 */
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Componet componet) {
        super(componet);
    }

    private void operFirst(){
        System.out.println("AoperFirst");
    }
    private void operLast(){
        System.out.println("AoperLast");
    }

    @Override
    public void operation() {
        operFirst();
        super.operation();
        operLast();
    }
}
