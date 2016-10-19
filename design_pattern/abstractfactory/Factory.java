package design_pattern.abstractfactory;

/**
 * Created by dezhonger on 2016/10/19.
 */
public class Factory implements IFactory {
    @Override
    public IProduct1 createProduct1() {
        return new Product1();
    }

    @Override
    public IProduct2 createProduct2() {
        return new Product2();
    }
}
