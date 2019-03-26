package com.srikanth.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srikanth.Model.Employee;

@Controller
public class EmpController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("/RegisterEmployee")
	public void addEmployee()
	{
		System.out.println("Employee Controller");
		System.out.println("sessionFactory = "+sessionFactory);
		
		Employee emp = new Employee();
		
		emp.seteName("Srikanth");
		emp.setRole("JavaDeveloper");
		
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(emp);
		
		tr.commit();
		
	}

}
