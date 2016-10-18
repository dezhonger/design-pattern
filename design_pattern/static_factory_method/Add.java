package design_pattern.static_factory_method;

/**
 * Created by zwl on 2016/10/18.
 */
public class Add extends Operation {
    @Override
    public double getResult() {
        return getNumber1() + getNumber2();
    }
}
