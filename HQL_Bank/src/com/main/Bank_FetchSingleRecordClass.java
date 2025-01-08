package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Bank_Entity.Bank_EntityClass;

public class Bank_FetchSingleRecordClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank_EntityClass.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Bank_EntityClass where bankID=:BANKID ";
		Query<Bank_EntityClass> query = ss.createQuery(hqlquery, Bank_EntityClass.class);
		query.setParameter("BANKID", 2);
		Bank_EntityClass bank = query.getSingleResult();
		System.out.println(bank);

		// select * from

		System.out.println("Fetch Data Successfully.....!");
		
	}

}
