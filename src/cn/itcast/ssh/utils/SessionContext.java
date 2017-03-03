package cn.itcast.ssh.utils;

import org.apache.struts2.ServletActionContext;

import cn.itcast.ssh.domain.User;


public class SessionContext {

	public static final String GLOBLE_USER_SESSION = "user";
	
	public static void setUser(User user){
		if(user!=null){
			ServletActionContext.getRequest().getSession().setAttribute(GLOBLE_USER_SESSION, user);
		}else{
			ServletActionContext.getRequest().getSession().removeAttribute(GLOBLE_USER_SESSION);
		}
	}
	
	public static User get(){
		return (User) ServletActionContext.getRequest().getSession().getAttribute(GLOBLE_USER_SESSION);
	}
}
