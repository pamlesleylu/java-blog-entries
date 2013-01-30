package com.plu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.plu.repository.DeptRepository;
import com.plu.repository.EmpRepository;

public class App {
	
	@Autowired
	private EmpRepository empRepo;
	
	@Autowired
	private DeptRepository deptRepo;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"META-INF/app-context.xml");
		
		context.getBean("app", App.class).execute();
	}
	
	@Transactional
	public void execute() {

	}
}
