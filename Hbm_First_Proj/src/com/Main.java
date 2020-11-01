package com;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.StandardServiceInitiators;

import dto.Student;

import org.hibernate.*;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		ServiceRegistryBuilder ssrb = new ServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		ServiceRegistry sr = ssrb.buildServiceRegistry();
		SessionFactory sf = cfg.buildSessionFactory(sr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Student std  = new Student(101, "ram", 7878.50f);
		s.save(std);
		tr.commit();
		s.close();
		sf.close();
	}

}
