package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Bank_Entity.Bank_EntityClass;

public class Bank_FetchAllRecordClass {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank_EntityClass.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		
		String hqlquery = "from Bank_EntityClass";
		Query<Bank_EntityClass> query = ss.createQuery(hqlquery, Bank_EntityClass.class);
		List<Bank_EntityClass> list= query.getResultList();
		for (Bank_EntityClass bank : list) {
			System.out.println(bank);
		}
			
		}
}
