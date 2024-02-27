package in.co.rays.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.co.rays.dto.UserDTO;


public class TestGetLoad {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();
//object not found Exception
		//UserDTO dto1 = (UserDTO) session.load(UserDTO.class, 4); 

		UserDTO dto1 = (UserDTO) session.get(UserDTO.class, 4);

		System.out.println(dto1);

	}

}