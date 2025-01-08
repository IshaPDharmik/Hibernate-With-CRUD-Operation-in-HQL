package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Bike_Entity.Bike_EntityClassHQL;


public class Bike_FetchAllDataM_Class {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bike_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		
		String hqlquery = "from Bike_EntityClassHQL";
		Query<Bike_EntityClassHQL> query = ss.createQuery(hqlquery, Bike_EntityClassHQL.class);
		List<Bike_EntityClassHQL> list= query.getResultList();
		for (Bike_EntityClassHQL bike : list) {
			System.out.println(bike);
		}
			
		}
	}
