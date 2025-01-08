package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Cloths_Entity.Cloths_EntityClassHQL;

public class InsertDataM_Class {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Cloths_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Cloths_EntityClassHQL(Name,Type,Size,Price)values(:clothsname,:clothstype,:clothssize,:clothsprice)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);

		query.setParameter("clothsname", "Blue-Jeans");
		query.setParameter("clothstype", "Pain");
		query.setParameter("clothssize", "L");
		query.setParameter("clothsprice", 400);
		query.executeUpdate();

		System.out.println("Insert Data Successfully....!");
		tr.commit();
		ss.close();
	}
}
