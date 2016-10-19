package design_pattern.publish_subscribe;

/**
 * Created by dezhonger on 2016/10/19.
 */
public class Police implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车有行动，警察护航");
    }
}
