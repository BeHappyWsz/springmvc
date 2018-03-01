package springmvc.entity;

import java.util.Map;
/**
 * 获取Map数据辅助类
 * @author wsz
 * @date 2018年3月1日
 */
public class UserMapForm {

	private Map<String,User> users;

	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserMapForm [users=" + users + "]";
	}
	
}
