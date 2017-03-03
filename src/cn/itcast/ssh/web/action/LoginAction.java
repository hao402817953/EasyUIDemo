package cn.itcast.ssh.web.action;

import cn.itcast.ssh.domain.User;
import cn.itcast.ssh.service.UserService;

public class LoginAction {
	
	private User user;
	
	private UserService userService; 
	
	public String login(){
		
		boolean flag = userService.login(user.getUserName(), user.getPassword());
		if (flag) {
			return "index";
		}
		return "login";
	}

//===========get和set方法====================================================================================================================	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
