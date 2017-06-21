package design_pattern.visitor;

/**
 * Created by dezhonger on 2017/6/21.
 */
public class Draw implements Service {

	@Override
	public void accept(Visitor visitor) {
		visitor.process(this);
	}
}
