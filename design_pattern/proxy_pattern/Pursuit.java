package design_pattern.proxy_pattern;

/**
 * Created by zwl on 2016/10/18.
 */
public class Pursuit implements GiveGift {
    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveFlower() {
        System.out.println(girl.getName() + "送你花");
    }

    @Override
    public void giveFood() {
        System.out.println(girl.getName() + "送你食物");
    }
}
