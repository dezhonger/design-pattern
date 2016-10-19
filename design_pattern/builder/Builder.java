package design_pattern.builder;

/**
 * Created by dezhonger on 2016/10/19.
 */

/**
 * 抽象建造者类
 */
public interface Builder {
    public void buildPart1();
    public void buildPart2();
    public Product retrieveResult();
}
