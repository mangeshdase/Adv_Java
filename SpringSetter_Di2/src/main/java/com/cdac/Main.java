package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		MyService m = (MyService) appCntx.getBean("serv");
		m.add();
 	}

}
