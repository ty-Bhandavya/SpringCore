package com.te.springcore.SpringCoreDemo.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee1 
{
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx = null;
	ctx = new ClassPathXmlApplicationContext("Beans.xml");
	
	Employee emp =  (Employee) ctx.getBean("employee");
	
	System.out.println(emp.getEmpno());
	System.out.println(emp.getEname());
	
	if (ctx != null) {
		ctx.close();
	}
}

}
