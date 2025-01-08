package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Employee_Entity.Employee_EntityClassHQL;


public class FetchAllDataM_Class {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		
		String hqlquery = "from Employee_EntityClassHQL";
		Query<Employee_EntityClassHQL> query = ss.createQuery(hqlquery, Employee_EntityClassHQL.class);
		List<Employee_EntityClassHQL> list= query.getResultList();
		for (Employee_EntityClassHQL employee : list) {
			System.out.println(employee);
		}
			
		}
	}

