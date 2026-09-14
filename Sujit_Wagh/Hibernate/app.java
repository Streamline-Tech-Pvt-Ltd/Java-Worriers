package in.st.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.st.entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User user = new User();
    	user.setId(1);
    	user.setName("kunal");
    	user.setDomain("java");
       Configuration cfg = new Configuration();
       cfg.configure("/in/st/config/hibernate.cfg.xml");
       
       SessionFactory sessionFactory = cfg.buildSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction transaction = session.beginTransaction();
       try {
    	   session.save(user);
    	   transaction.commit();
       }catch(Exception e)
       {
    	   e.printStackTrace();
       }
    }
}
