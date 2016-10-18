package design_pattern.proxy_pattern;

/**
 * Created by zwl on 2016/10/18.
 */
public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl("rby");
        Proxy proxy = new Proxy(girl);
        proxy.giveFood();
        proxy.giveFlower();
    }
}
