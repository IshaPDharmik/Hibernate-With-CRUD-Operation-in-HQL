package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.PetAnimals_Entity.PetAnimals_EntityClassHQL;

public class InsertDataM_Class {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(PetAnimals_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into PetAnimals_EntityClassHQL(name,color,weight)values(:petAname,:petAcolor,:petAweight)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);

		query.setParameter("petAname", "Cat");
		query.setParameter("petAcolor", "Black-White");
		query.setParameter("petAweight", 5.5);
		
		query.executeUpdate();

		System.out.println("Insert Data Successfully....!");
		tr.commit();
		ss.close();
	}

}
