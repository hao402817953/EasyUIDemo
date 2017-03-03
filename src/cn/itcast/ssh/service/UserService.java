package cn.itcast.ssh.service;

import cn.itcast.ssh.domain.User;

public interface UserService {
	
	/**
	 * 登录
	 * @title login
	 * @description TODO
	 * @author Administrator
	 * @create_date 2017年3月2日
	 * @return
	 */
	public boolean login(String username,String password);
}
