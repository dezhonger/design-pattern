package design_pattern.chain_of_responsibility;

/**
 * Created by dezhonger on 2017/3/27.
 */
public class ProjectManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//项目经理权限比较小，只能在500以内
		if (fee < 500) {
			if ("userA".equals(user)) {
				str = "success";
			} else {
				str = "failure";
			}
		} else {
			//500，继续传递给级别更高的人处理
			if (getSuccessor() != null) {
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return str;
	}
}
