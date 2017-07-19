package hibernateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EditProducts {

	public static void main(String[] args){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Product editProducts = new Product();
		editProducts.setProductCode("les_paul2");
		editProducts.setProductName("Gibson Les Paul V2");
		editProducts.setProductID(15);
		editProducts.setListPrice(999);
		
		session.save(editProducts);
		transaction.commit();
		System.out.println("Product Added.");
	}
}
