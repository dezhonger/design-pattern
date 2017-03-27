package design_pattern.chain_of_responsibility;

/**
 * Created by dezhonger on 2017/3/27.
 */
public class DeptManager extends Handler {
	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//部门经理的权限只能在1000以内
		if (fee < 1000) {
			//为了测试，简单点，只同意张三的请求
			if ("userB".equals(user)) {
				str = "success";
			} else {
				//其他人一律不同意
				str = "failure";
			}
		} else {
			//超过1000，继续传递给级别更高的人处理
			if (getSuccessor() != null) {
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return str;
	}
}
