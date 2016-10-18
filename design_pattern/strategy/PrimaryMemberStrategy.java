package design_pattern.strategy;

/**
 * Created by zwl on 2016/10/18.
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double bookPrice) {
        return bookPrice;
    }
}
