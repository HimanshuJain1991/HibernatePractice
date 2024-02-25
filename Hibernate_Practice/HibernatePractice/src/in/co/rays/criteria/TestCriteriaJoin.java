package in.co.rays.criteria;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import in.co.rays.auction.AuctionItem;
import in.co.rays.auction.Bid;

public class TestCriteriaJoin {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(AuctionItem.class);
		
		criteria.add(Restrictions.like("id",1));
		List  list=criteria.list();
		Iterator it=list.iterator();
		while(it.hasNext()) {
          AuctionItem auction=(AuctionItem)it.next();			
		System.out.println(auction.getId());
		System.out.println(auction.getDescription());
		Set s=auction.getBids();
		Iterator it1=s.iterator();
		while(it1.hasNext()) {
			Bid object =(Bid) it1.next();
			System.out.println(object.getId());
			System.out.println(object.getAmount());
			System.out.println(object.getTimeStamp());
		}
		}
		session.close();

	}

}
