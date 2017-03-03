package cn.itcast.ssh.service.impl;

import java.util.List;

import cn.itcast.ssh.dao.DeptDao;
import cn.itcast.ssh.domain.Dept;
import cn.itcast.ssh.service.DeptService;

public class DeptServiceImpl implements DeptService{

	
	private DeptDao deptDao;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}


	@Override
	public List<Dept> getAllDept() {
		List<Dept> list = deptDao.getAllDept();
		System.out.println(list+"====================");
		return list;
	}

}
