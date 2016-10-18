package design_pattern.muban;

/**
 * Created by zwl on 2016/10/18.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass c;
        c = new ConcreteA();
        c.templateMethod();

        c = new ConcreteB();
        c.templateMethod();
    }
}
