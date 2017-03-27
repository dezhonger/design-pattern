package design_pattern.chain_of_responsibility;

/**
 * Created by dezhonger on 2017/3/27.
 */
public class GeneralManager extends Handler {
	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//总经理的权限很大，只要请求到了这里，他都可以处理
		if (fee >= 1000) {
			//为了测试，简单点，只同意张三的请求
			if ("userC".equals(user)) {
				str = "success";
			} else {
				//其他人一律不同意
				str = "failure";
			}
		} else {
			//如果还有后继的处理对象，继续传递
			if (getSuccessor() != null) {
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return str;
	}
}
