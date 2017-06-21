package design_pattern.visitor;

/**
 * Created by dezhonger on 2017/6/21.
 * http://www.cnblogs.com/draem0507/p/3795158.html
 */
public interface Service {

	public void accept(Visitor visitor);
}
