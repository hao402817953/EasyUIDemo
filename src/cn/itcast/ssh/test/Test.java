package cn.itcast.ssh.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssh.domain.Dept;
import cn.itcast.ssh.service.DeptService;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptService deptService=(DeptService) ac.getBean("deptService");
		List<Dept> list = deptService.getAllDept();
		System.out.println(list);
	}
}
