package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import dto.Student;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		ServiceRegistryBuilder srb = new ServiceRegistryBuilder();
		srb.applySettings(cfg.getProperties());
		ServiceRegistry sr = srb.buildServiceRegistry();
		SessionFactory sf = cfg.buildSessionFactory(sr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Student std = new Student(101, "ram", 7878.50f);
		s.save(std);
		tr.commit();
		s.clear();
		sf.close();
	}

}
