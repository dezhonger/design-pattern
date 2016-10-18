package com.zhuangshiqi;

/**
 * Created by dezhonger on 2016/10/18.
 */
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Componet componet) {
        super(componet);
    }

    private void operFirst(){
        System.out.println("BoperFirst");
    }
    private void operLast(){
        System.out.println("BoperLast");
    }

    @Override
    public void operation() {
        operFirst();
        super.operation();
        operLast();
    }
}
