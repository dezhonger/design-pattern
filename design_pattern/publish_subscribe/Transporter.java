package design_pattern.publish_subscribe;

/**
 * Created by dezhonger on 2016/10/19.
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 */
public class Transporter implements Watched{
    private List<Watcher> list = new ArrayList<>();
    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notifyWatchers() {
        for(Watcher watcher: list) {
            watcher.update();
        }
    }
}
