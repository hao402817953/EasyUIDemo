package cn.itcast.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.DeptDao;
import cn.itcast.ssh.domain.Dept;

public class DeptDaoImpl extends HibernateDaoSupport implements DeptDao{

	@Override
	public List<Dept> getAllDept() {
		String hql="FROM Dept";
		System.out.println("--------------------------------------------");
		List list = this.getHibernateTemplate().find(hql);
		System.out.println("======================"+list+"===========================");
		return list;
	}

}
