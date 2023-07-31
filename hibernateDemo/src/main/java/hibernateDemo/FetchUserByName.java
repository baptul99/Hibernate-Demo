package hibernateDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchUserByName {

	public static void main(String[] args) 
	{
     String qry= "select u from user u where u.name=?1";
     EntityManager manager =Persistence.createEntityManagerFactory("devv").createEntityManager();
     Query q=manager.createQuery(qry);
     q.setParameter(1, "Gonesh");
     List<user> Users= q.getResultList();
     if(Users.size()>0)
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
