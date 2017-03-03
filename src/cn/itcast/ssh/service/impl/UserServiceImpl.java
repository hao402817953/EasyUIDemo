package cn.itcast.ssh.service.impl;

import cn.itcast.ssh.dao.UserDao;
import cn.itcast.ssh.domain.User;
import cn.itcast.ssh.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public boolean login(String username, String password) {
		boolean flag=false;
		User user = userDao.getOneUser(username, password);
		if (user!=null) {
			 flag=true;
		}
		
		return flag;
	}

}
