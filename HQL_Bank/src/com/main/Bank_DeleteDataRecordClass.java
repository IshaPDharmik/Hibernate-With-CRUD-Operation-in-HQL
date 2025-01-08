package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Bank_Entity.Bank_EntityClass;

public class Bank_DeleteDataRecordClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank_EntityClass.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "Delete from Bank_EntityClass where bankID=:BANKID ";
		Query<Bank_EntityClass> query = ss.createQuery(hqlquery);
		int bankID = 2;
		query.setParameter(bankID, "bankID,2");
		query.executeUpdate();

		System.out.println("Data Delete Successfully....!");
		tr.commit();
		ss.close();
	}
}