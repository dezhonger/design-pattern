package design_pattern.strategy;

/**
 * Created by zwl on 2016/10/18.
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double bookPrice) {
        return bookPrice * 0.8;
    }
}
