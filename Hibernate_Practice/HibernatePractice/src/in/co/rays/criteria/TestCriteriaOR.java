package in.co.rays.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import in.co.rays.dto.UserDTO;

public class TestCriteriaOR {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		Criteria criteria=session.createCriteria(UserDTO.class);
         criteria.add(Restrictions.or(Restrictions.like("firstName", "H%"), Restrictions.like("lastName", "J%")));
	   List  list=criteria.list();
	   Iterator it=list.iterator();
	   while(it.hasNext()) {
		   UserDTO dto=(UserDTO)it.next();
		   System.out.println(dto.getId());
	        System.out.println(dto.getFirstName());
	        System.out.println(dto.getLastName());
	        System.out.println(dto.getLogin());
	        System.out.println(dto.getPassword());
	        System.out.println(dto.getAddress());
	        System.out.println(dto.getDob());
	   }
	}

}
