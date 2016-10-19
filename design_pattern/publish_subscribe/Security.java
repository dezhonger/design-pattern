package design_pattern.publish_subscribe;

/**
 * Created by dezhonger on 2016/10/19.
 */

/**
 * 保镖
 */
public class Security implements Watcher{
    @Override
    public void update() {
        System.out.println("运输车有行动，保安贴身保护");
    }
}
