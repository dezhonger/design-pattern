package com.zhuangshiqi;

/**
 * Created by dezhonger on 2016/10/18.
 */
public abstract class Decorator extends Componet{
    protected Componet componet;

    public Decorator(Componet componet) {
        this.componet = componet;
    }

    @Override
    public void operation() {
        componet.operation();
    }
}
