package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Bank_Entity.Bank_EntityClass;

public class Bank_InsertDataRecordClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank_EntityClass.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Bank_EntityClass(Name,Position,Address,Salary)values(:myname,:myposition,:myaddress,:mysalary)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("myname", "Saina");
		query.setParameter("myposition", "BankUser");
		query.setParameter("myaddress", "Mumbai");
		query.setParameter("mysalary", 55000);
		query.executeUpdate();

		System.out.println("Insert Data Successfully....!");
		tr.commit();
		ss.close();
	}

}
