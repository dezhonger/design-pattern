package design_pattern.strategy;

/**
 * Created by zwl on 2016/10/18.
 */
public class Price {
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double bookPrice) {
        return memberStrategy.calPrice(bookPrice);
    }
}
