package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Cloths_Entity.Cloths_EntityClassHQL;

public class FetchAllDataM_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Cloths_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Cloths_EntityClassHQL";
		Query<Cloths_EntityClassHQL> query = ss.createQuery(hqlquery, Cloths_EntityClassHQL.class);
		List<Cloths_EntityClassHQL> list = query.getResultList();
		for (Cloths_EntityClassHQL cloths : list) {
			System.out.println(cloths);
		}

	}
}
