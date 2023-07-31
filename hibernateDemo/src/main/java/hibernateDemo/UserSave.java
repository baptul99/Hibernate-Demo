package hibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserSave {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter name,phone and password");
		String name = s.next();
		long phone = s.nextLong();
		String password = s.next();
		user u = new user();
		u.setName(name);
		u.setPhone(phone);
		u.setPassword(password);
		System.out.println("ID before Saving" + u.getId());
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("devv");
		EntityManager manager = factory.createEntityManager();
		manager.persist(u);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("User save with id" + u.getId());
	}

}
