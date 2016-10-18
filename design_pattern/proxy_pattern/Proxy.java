package design_pattern.proxy_pattern;

/**
 * Created by zwl on 2016/10/18.
 */
public class Proxy implements GiveGift {
    Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveFlower() {
        pursuit.giveFlower();
    }

    @Override
    public void giveFood() {
        pursuit.giveFood();
    }
}
