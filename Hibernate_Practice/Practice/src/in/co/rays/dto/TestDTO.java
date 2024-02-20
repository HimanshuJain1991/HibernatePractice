package in.co.rays.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         UserDTO dto=new UserDTO();
         //dto.setId(3);
         dto.setFirstName("Lokesh ");
         dto.setLastName("Sharma");
         dto.setLogin("Naman@gmail.com");
         dto.setPassword("123");
         dto.setDob(new Date());
         dto.setAddress("Ujjain");
         SessionFactory sf=new Configuration().configure().buildSessionFactory();
         Session session=sf.openSession();
         Transaction tx=session.beginTransaction();
         session.save(dto);
         tx.commit();
         session.close();
	}

}
