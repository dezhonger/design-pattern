package design_pattern.muban;

/**
 * Created by zwl on 2016/10/18.
 */
public abstract class AbstractClass {

    //一些抽象行为，放到子类中去实现
    public abstract void f1();
    public abstract void f2();

    public void templateMethod() {
        f1();
        f2();
    }
}
