package in.co.rays.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.dto.UserDTO;

public class TestHQLAll{

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
	    Transaction tx=session.beginTransaction();
	    Query q=session.createQuery("from UserDTO");
	    List list=q.list();
	    Iterator it=list.iterator();
	    while(it.hasNext()) {
	    	UserDTO dto=(UserDTO)it.next();
	    	System.out.println(dto.getId());
	    	System.out.println(dto.getFirstName());
	    	System.out.println(dto.getLastName());
	    	System.out.println(dto.getLogin());
	    	System.out.println(dto.getPassword());
	    	System.out.println(dto.getAddress());
	    }

	}

}
