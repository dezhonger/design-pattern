package design_pattern.builder;

/**
 * Created by dezhonger on 2016/10/19.
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("编号：1234");
    }

    @Override
    public void buildPart2() {
        product.setPart2("name:dezhonger");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
