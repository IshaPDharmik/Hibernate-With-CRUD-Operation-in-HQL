package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Cloths_Entity.Cloths_EntityClassHQL;

public class UpdateDataM_Class {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Cloths_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "Update Cloths_EntityClassHQL set Name=:clothsname, Type=:clothstype, Size=:clothssize, Price=:clothsprice where clothID=: CLOTHSid";
		MutationQuery query = ss.createMutationQuery(hqlquery);

		query.setParameter("clothsname", "Black-Jeans");
		query.setParameter("clothstype", "HighWeast");
		query.setParameter("clothssize", 32);
		query.setParameter("clothsprice", 600);
		query.setParameter("CLOTHSid", 2);
		query.executeUpdate();

		System.out.println("Update Data Successfully...!");
		tr.commit();
		ss.close();

	}

}
