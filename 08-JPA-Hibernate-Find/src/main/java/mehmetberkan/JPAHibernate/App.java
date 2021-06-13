package mehmetberkan.JPAHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mehmetberkan.JPAHibernate.model.Student;


public class App {

	public static void main(String[] args) {
	Student student;	
				SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();  
			student = session.find(Student.class, 1);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}	
		
		if(student != null) {
		System.out.println("Name = "+ student.getFirstName());
		System.out.println("Lastname = "+ student.getLastName());
		System.out.println("Email = "+ student.getEmail());
		
		}
		else {
			System.out.print("Null");
		}
	}
	
}
