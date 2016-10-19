package design_pattern.publish_subscribe;

/**
 * Created by dezhonger on 2016/10/19.
 */

/**
 * 抽象的被观察者
 */
public interface Watched {
    public void addWatcher(Watcher watcher);
    public void removeWatcher(Watcher watcher);
    public void notifyWatchers();
}
