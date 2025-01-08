package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Employee_Entity.Employee_EntityClassHQL;

public class UpdateDataM_Class {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "Update Employee_EntityClassHQL set name=:employeename, position=:employeeposition, address=:employeeaddress, salary=:employeesalary where employeeID=:EMPLOYEEid";
		MutationQuery query = ss.createMutationQuery(hqlquery);

		query.setParameter("employeename", "Bittu");
		query.setParameter("employeeposition", "Mock Department");
		query.setParameter("employeeaddress", "Pimpri Chinchwad");
		query.setParameter("employeesalary", 450000);
		query.setParameter("EMPLOYEEid", 7);
		query.executeUpdate();

		System.out.println("Update Data Successfully...!");
		tr.commit();
		ss.close();

	}

}
