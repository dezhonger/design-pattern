package design_pattern.adapter.com_object;

import design_pattern.adapter.com_class.Adaptee;
import design_pattern.adapter.com_class.Target;

/**
 * Created by dezhonger on 2016/10/20.
 */
public class Adapter {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    public void sampleOperation2() {

    }
}
