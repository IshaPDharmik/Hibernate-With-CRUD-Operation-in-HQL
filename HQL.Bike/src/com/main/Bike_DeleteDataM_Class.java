package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Bike_Entity.Bike_EntityClassHQL;

public class Bike_DeleteDataM_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bike_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "Delete from Bike_EntityClassHQL where bikeID=:BIKEID ";
		Query<Bike_DeleteDataM_Class> query = ss.createQuery(hqlquery);
		int bikeID = 6;
		query.setParameter("BIKEID",bikeID);
		query.executeUpdate();

		System.out.println("Data Delete Successfully....!");
		tr.commit();
		ss.close();
	}
}