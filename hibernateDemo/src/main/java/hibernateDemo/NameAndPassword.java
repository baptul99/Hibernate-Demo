package hibernateDemo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NameAndPassword {

	public static void main(String[] args) {

		Scanner c=new Scanner(System.in);
		System.out.println("Please enter name number: ");
		String name=c.next();
		System.out.println("Please enter Password number: ");
		String password=c.next();

		  String qry= "select u from user u where u.name=?1 and u.password=?2";
		     EntityManager manager =Persistence.createEntityManagerFactory("devv").createEntityManager();
		     Query q=manager.createQuery(qry);
		     
		  q.setParameter(1, name);
		  q.setParameter(2, password);
		  
		     List<user> Users= q.getResultList();
		     
		     if(Users.size() >0 )
		    	 
		     {
		    	 for (user u :Users) 
		    	 {
		    		 System.out.println("id:"+u.getId());
		 			System.out.println("Name:"+u.getName());
		 			System.out.println("phone:"+u.getPhone());
		 			System.out.println("password:"+u.getPassword());
		    	 }
		    	 }else {
		    		 System.err.println("Invalid number");
		     }


			}

		}