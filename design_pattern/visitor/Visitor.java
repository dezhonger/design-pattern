package design_pattern.visitor;

/**
 * Created by dezhonger on 2017/6/21.
 */
public class Visitor {

	public void process(Service service) {
		System.out.println("基本业务");
	}

	public void process(Saving service) {
		System.out.println("存款");
	}

	public void process(Draw service) {
		System.out.println("提款");
	}

	public void process(Fund service) {
		System.out.println("基金");
	}
}
