package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Cloths_Entity.Cloths_EntityClassHQL;

public class Cloth_DeleteDataM_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Cloths_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "Delete from Cloths_EntityClassHQL where clothsID=:CLOTHSID ";
		Query<Cloth_DeleteDataM_Class> query = ss.createQuery(hqlquery);
		int clothsID = 6;
		query.setParameter("CLOTHSID", clothsID);
		query.executeUpdate();

		System.out.println("Data Delete Successfully....!");
		tr.commit();
		ss.close();
	}
}