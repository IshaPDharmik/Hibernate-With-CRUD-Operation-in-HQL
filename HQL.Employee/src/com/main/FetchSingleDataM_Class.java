package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Employee_Entity.Employee_EntityClassHQL;

public class FetchSingleDataM_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Employee_EntityClassHQL where employeeID=:EMPLOYEEid ";
		Query<Employee_EntityClassHQL> query = ss.createQuery(hqlquery, Employee_EntityClassHQL.class);
		query.setParameter("EMPLOYEEid", 2);
		Employee_EntityClassHQL employee = query.getSingleResult();
		System.out.println(employee);

		// select * from

		System.out.println("Fetch Single Data Successfully.....!");

	}

}
