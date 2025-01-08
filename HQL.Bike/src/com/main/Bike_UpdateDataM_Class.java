package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Bike_Entity.Bike_EntityClassHQL;


public class Bike_UpdateDataM_Class {
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bike_EntityClassHQL.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
        Transaction tr= ss.beginTransaction();
        
        String hqlquery= "Update Bike_EntityClassHQL set Model=:bikemodel, Price=:bikeprice where bikeID=: bikeid";
        MutationQuery query = ss.createMutationQuery(hqlquery);
	    
        query.setParameter("bikemodel","PasionPro");
        query.setParameter("bikeprice",600000);
        query.setParameter("bikeid",3);
        query.executeUpdate();
        
        System.out.println("Update Data Successfully...!");
        tr.commit();
        ss.close();
	
	}

}
