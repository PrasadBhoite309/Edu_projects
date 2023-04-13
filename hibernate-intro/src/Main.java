import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		  
		Employee emp= new Employee();
		emp.setId(12);
		emp.setName("ravi");
		emp.setEmail("ravi@gmail.com");
		emp.setContact("7447509424");
		
		Configuration cfg = new Configuration();
		cfg.configure("hbm-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		//session.save(emp);
		//session.update(emp);
		session.delete(emp);
		//session.get();
		
		//Employee e = session.get(Employee.class,10)//
		
		
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();

	}

}
