package design_pattern.static_factory_method;

/**
 * Created by zwl on 2016/10/18.
 */
public abstract class Operation {
    private double number1 = 0;
    private double number2 = 0;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public abstract double getResult();
}
