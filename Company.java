package com.te.springcore.SpringCoreDemo.Bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company implements InitializingBean,DisposableBean
{
	private int numberOfEmployee;
	private String name;
	private String location;
	
	
	public void destroy() throws Exception {
		System.out.println("init() phase");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("init() phase");
		
	}
	
//	public void init() {
//		System.out.println("init() phase");
//	}
//	
//	public void destory() {
//		
//		System.out.println("destroy() phase");
//	}
}
