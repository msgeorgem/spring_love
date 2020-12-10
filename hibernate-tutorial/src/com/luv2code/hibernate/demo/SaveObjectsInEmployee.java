package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;
import com.luv2code.hibernate.demo.entity.Student;

public class SaveObjectsInEmployee {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create 3 student objects
			System.out.println("Creating 3 student objects...");
			Employee tempEmployee1 = new Employee("John", "Doe", "qwerty");
			Employee tempEmployee2 = new Employee("Mary", "Public", "234567");
			Employee tempEmployee3 = new Employee("Bonita", "Applebum", "asdfgh");
			
			// start a transaction
			session.beginTransaction();
			
			// save the employee object
			System.out.println("Saving the employees...");
			session.save(tempEmployee1);
			session.save(tempEmployee2);
			session.save(tempEmployee3);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
		
		// create session factory
				SessionFactory factory1 = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Employee.class)
										.buildSessionFactory();
		
		// create session
		Session session1 = factory1.getCurrentSession();
		
		try {			
			
			// start a transaction
			session1.beginTransaction();
			
			// query employees
			List<Employee> theEmployees = session1.createQuery("from Employee").getResultList();
			
			
			// query students: lastName='Doe' OR firstName='Daffy'
			theEmployees = session1.createQuery("from Employee s where" + " s.company='234567' OR s.company='asdfgh'").getResultList();
			
			extracted(theEmployees);
			
			// commit transaction
			session1.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
		
	}

	private static void extracted(List<Employee> theEmployees) {
		for (Employee tempEmployee : theEmployees) {
			System.out.println(tempEmployee);
		}
	}

}
