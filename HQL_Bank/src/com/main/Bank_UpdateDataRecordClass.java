package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.Bank_Entity.Bank_EntityClass;

public class Bank_UpdateDataRecordClass {
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank_EntityClass.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
        Transaction tr= ss.beginTransaction();
        
        String hqlquery= "Update Bank_EntityClass set Name=:myname, Salary=:mysalary where bankID=: myid";
        MutationQuery query = ss.createMutationQuery(hqlquery);
	    
        query.setParameter("myname","Sakshi");
        query.setParameter("mysalary",45000);
        query.setParameter("myid",6);
        query.executeUpdate();
        
        System.out.println("Update Data Successfully...!");
        tr.commit();
        ss.close();
	
	}

}
