package hibernateTime;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StartHibernate {
	
	private static final SessionFactory sessionFactory;
	
	static{
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex){
			System.err.println("Connection Failed" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
