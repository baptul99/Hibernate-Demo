package hibernateDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchUserByPhone {

	public static void main(String[] args)
	{
		String qry= "select u from user u where u.phone=:ph";
	     EntityManager manager =Persistence.createEntityManagerFactory("devv").createEntityManager();
	     Query q=manager.createQuery(qry);
	    q.setParameter("ph", 755656L);
	   
	    	try {
	    		user u =(user) q.getSingleResult();
	    		 System.out.println("id:"+u.getId());
	 			System.out.println("Name:"+u.getName());
	 			System.out.println("phone:"+u.getPhone());
	 			System.out.println("password:"+u.getPassword());
	    	 
	    	 }catch(NoResultException e) {
	    		 System.err.println("Invalid number");
	     }


		}

	}
