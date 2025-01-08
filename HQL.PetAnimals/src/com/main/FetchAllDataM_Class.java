package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.PetAnimals_Entity.PetAnimals_EntityClassHQL;

public class FetchAllDataM_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(PetAnimals_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from PetAnimals_EntityClassHQL";
		Query<PetAnimals_EntityClassHQL> query = ss.createQuery(hqlquery, PetAnimals_EntityClassHQL.class);
		List<PetAnimals_EntityClassHQL> list = query.getResultList();
		for (PetAnimals_EntityClassHQL PAnimals : list) {
			System.out.println(PAnimals);
		}

	}
}
