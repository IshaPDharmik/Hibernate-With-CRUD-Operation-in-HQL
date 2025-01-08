package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Bike_Entity.Bike_EntityClassHQL;

public class Bike_InsertDataM_Class {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bike_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Bike_EntityClassHQL(Model,Color,Price)values(:bikeModel,:bikeColor,:bikePrice)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);

		query.setParameter("bikeModel", "Pulsur180");
		query.setParameter("bikeColor", "Red");
		query.setParameter("bikePrice", 2500000);
		query.executeUpdate();

		System.out.println("Insert Data Successfully....!");
		tr.commit();
		ss.close();
	}

}

