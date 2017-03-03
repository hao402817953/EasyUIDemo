package cn.itcast.ssh.dao;

import cn.itcast.ssh.domain.User;

public interface UserDao {
	
	/**
	 * 根据id得到一个对象
	 * @title getOneUser
	 * @description TODO
	 * @author Administrator
	 * @create_date 2017年3月2日
	 * @param id
	 * @return
	 */
	public User getOneUser(String id);
	/**
	 * 根据id得到一个对象
	 * @title getOneUser
	 * @description TODO
	 * @author Administrator
	 * @create_date 2017年3月2日
	 * @param id
	 * @return
	 */
	public User getOneUser(String username, String password);
}
