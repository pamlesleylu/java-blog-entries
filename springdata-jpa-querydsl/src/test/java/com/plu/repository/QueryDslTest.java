package com.plu.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.plu.domain.Dept;
import com.plu.domain.Emp;
import com.plu.domain.QEmp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/app-context.xml"})
public class QueryDslTest {

	@Autowired
	private DeptRepository deptRepo;
	
	@Autowired
	private EmpRepository empRepo;
	
	@Before
	public void setup() {
		Dept dept = new Dept();
		dept.setName("finance");
		dept = deptRepo.save(dept);
		
		Emp emp = new Emp();
		emp.setDept(dept);
		emp.setName("John Doe");
		empRepo.save(emp);

	}
	
	@Test
	@Transactional
	@Rollback(true)
	public void testQueryDsl() {
		QEmp empQuery = QEmp.emp;
		
		Emp emp = empRepo.findOne(empQuery.name.like("John%"));
		
		Assert.assertNotNull(emp);
		Assert.assertEquals("John Doe", emp.getName());
	}
}
