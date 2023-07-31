package hibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateUser {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id: ");
		int id =sc.nextInt();
		System.out.println("Enter name , phone and password to Update");
		String name =sc.next();
		long phone=sc.nextLong();
		String password=sc.next();
		user u=new user();
		u.setId(id);
		u.setName(name);
		u.setPassword(password);
		u.setPhone(phone);
		EntityManager manager= Persistence.createEntityManagerFactory("devv").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.merge(u);
		transaction.begin();
		transaction.commit();
		System.out.println("Update succecfull");
	}

}
