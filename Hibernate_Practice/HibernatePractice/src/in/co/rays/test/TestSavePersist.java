package in.co.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.dto.UserDTO;


public class TestSavePersist {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();
        dto.setId(11);
		dto.setFirstName("pranav");
		dto.setLastName("mahajan");
		dto.setLogin("pranav@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		//int i = (int) session.save(dto);it returns serializble object means int

	//	System.out.println("i => " + i);

		// session.persist(dto);//it returns void

		// session.saveOrUpdate(dto);

		tx.commit();

		session.close();

	}
}