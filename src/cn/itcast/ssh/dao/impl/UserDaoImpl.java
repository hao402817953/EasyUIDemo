package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.UserDao;
import cn.itcast.ssh.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public User getOneUser(String id) {
		User user=null;
		String hql="FROM User where id=?";
		List<User> list = this.getHibernateTemplate().find(hql,id);
		if (list!=null) {
			user=list.get(0);
		}
		return user;
	}
	@Override
	public User getOneUser(String username, String password) {
		User user=null;
		String hql="FROM User where userName=? and password=?";
		String[] parameter={username,password};
		List<User> list = this.getHibernateTemplate().find(hql,parameter);
		if (list!=null) {
			user=list.get(0);
		}
		return user;
	}

}
