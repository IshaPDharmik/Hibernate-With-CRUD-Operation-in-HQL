package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Employee_Entity.Employee_EntityClassHQL;


public class InsertDataM_Class {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Employee_EntityClassHQL(name,position,address,salary)values(:employeename,:employeeposition,:employeeaddress,:employeesalary)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);

		query.setParameter("employeename", "Bittu");
		query.setParameter("employeeposition", "Frersher");
		query.setParameter("employeeaddress", "Pune");
		query.setParameter("employeesalary", 40000);
		query.executeUpdate();

		System.out.println("Insert Data Successfully....!");
		tr.commit();
		ss.close();
	}

}

