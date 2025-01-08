package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Employee_Entity.Employee_EntityClassHQL;


public class DeleteDataM_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "Delete from Employee_EntityClassHQL where employeeID=:EMPLOYEEid ";
		Query<Employee_EntityClassHQL> query = ss.createQuery(hqlquery);
		int employeeID = 4;
		query.setParameter("EMPLOYEEid",employeeID);
		query.executeUpdate();

		System.out.println("Data Delete Successfully....!");
		tr.commit();
		ss.close();
	}
}