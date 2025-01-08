package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Bike_Entity.Bike_EntityClassHQL;


public class Bike_FetchSingleDataM_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bike_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Bike_EntityClassHQL where bikeID=:BIKEID ";
		Query<Bike_EntityClassHQL> query = ss.createQuery(hqlquery, Bike_EntityClassHQL.class);
		query.setParameter("BIKEID", 2);
		Bike_EntityClassHQL bike = query.getSingleResult();
		System.out.println(bike);

		// select * from

		System.out.println("Fetch Single Data Successfully.....!");
		
	}

}

