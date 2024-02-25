package in.co.rays.sql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSQLOrderBy {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		SQLQuery q=session.createSQLQuery("select * from user order by firstname");
        List list=q.list();
        Iterator it=list.iterator();
        while(it.hasNext()) {
        	Object[] dto=(Object[])it.next();
        	System.out.println(dto[0]);
        	System.out.println(dto[1]);
        	System.out.println(dto[2]);
        	System.out.println(dto[3]);
        }
        tx.commit();
        session.close();
	}


	}


