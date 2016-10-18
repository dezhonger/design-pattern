package design_pattern.static_factory_method;

/**
 * Created by zwl on 2016/10/18.
 */
public class Div extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        try {
            result = getNumber1() / getNumber2();
        } catch (Exception e) {
            System.out.println("除数不能为0！");
            e.printStackTrace();
        }
        return result;
    }
}
