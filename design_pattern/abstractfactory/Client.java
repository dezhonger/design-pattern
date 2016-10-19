package design_pattern.abstractfactory;

/**
 * Created by dezhonger on 2016/10/19.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
