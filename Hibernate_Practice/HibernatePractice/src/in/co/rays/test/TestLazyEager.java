package in.co.rays.test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.auction.AuctionItem;

public class TestLazyEager {

	public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx =session.beginTransaction();
	AuctionItem item=(AuctionItem)session.get(AuctionItem.class, 1);
	Set  s =item.getBids();//by default lazy chalta hai it fetch data limited hbm mai lazy="true" kiya hai
	//single query work
	//Eager: joins ke sath query lata hai hbm mai fetch="joins"
	Iterator it=s.iterator();
	tx.commit();
	session.close();

	}

}
