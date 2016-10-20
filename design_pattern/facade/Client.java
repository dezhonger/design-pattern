package design_pattern.facade;

/**
 * Created by dezhonger on 2016/10/20.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
