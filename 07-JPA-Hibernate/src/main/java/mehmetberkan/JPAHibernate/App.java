package mehmetberkan.JPAHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import mehmetberkan.JPAHibernate.model.Student;


public class App {
    
	public static void main( String[] args ) {
		SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Student student = new Student("Mehmet","Gr", "mbgr@mail.com");
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}	
    }
}