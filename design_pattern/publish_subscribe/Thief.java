package design_pattern.publish_subscribe;

/**
 * Created by dezhonger on 2016/10/19.
 */
public class Thief implements Watcher{
    @Override
    public void update() {
        System.out.println("运输车有行动，强盗准备动手");
    }
}
