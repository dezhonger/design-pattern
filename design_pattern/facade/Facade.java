package design_pattern.facade;

/**
 * Created by dezhonger on 2016/10/20.
 */
public class Facade {
    private Class1 one = new Class1();
    private Class2 two = new Class2();
    private Class3 three = new Class3();

    public void f1() {
        System.out.println("f1");
        one.f();
    }
    public void f2() {
        System.out.println("f2");
        two.f();
    }
    public void f3() {
        System.out.println("f3");
        three.f();
    }
    public void method() {
        System.out.println("method");
        f1();
        f2();
        f3();
    }
}
