package design_pattern.static_factory_method;

/**
 * Created by zwl on 2016/10/18.
 */
public class OperationFactory {
    public static Operation createOperate(String str) {
        Operation result = null;
        switch (str) {
            case "+": result = new Add(); break;
            case "-": result = new Sub(); break;
            case "*": result = new Mul(); break;
            case "/": result = new Div(); break;
        }
        return result;
    }
}
