package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.PetAnimals_Entity.PetAnimals_EntityClassHQL;

public class DeleteDataM_Class {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(PetAnimals_EntityClassHQL.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "Delete from PetAnimals_EntityClassHQL where petID=:PETid ";
		Query<PetAnimals_EntityClassHQL> query = ss.createQuery(hqlquery);
		int petID = 3;
		query.setParameter("PETid", petID);
		query.executeUpdate();

		System.out.println("Data Delete Successfully....!");
		tr.commit();
		ss.close();
	}
}