package com.zhuangshiqi;

/**
 * Created by dezhonger on 2016/10/18.
 */
public class Client {
    public static void main(String[] args) {
        Componet c1 = new ConcreteComponet();
        Decorator decoratorA = new ConcreteDecoratorA(c1);
//        decoratorA.operation();

        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();
    }
}
