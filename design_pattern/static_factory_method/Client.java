package design_pattern.static_factory_method;

/**
 * Created by zwl on 2016/10/18.
 */
public class Client {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperate("/");
        oper.setNumber1(5);
        oper.setNumber2(0);
        System.out.println(oper.getResult());
    }
}
