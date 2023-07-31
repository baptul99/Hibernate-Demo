package hibernateDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchAllUser
{
	public static void main(String[] args)
	{
		String qry="select u from user u";
		EntityManager manager=Persistence.createEntityManagerFactory("devv").createEntityManager();
				Query q=manager.createQuery(qry);
     List<user> Users= q.getResultList();
		for(user u :Users)
		{
			System.out.println("id:"+u.getId());
			System.out.println("Name:"+u.getName());
			System.out.println("phone:"+u.getPhone());
			System.out.println("password:"+u.getPassword());
		}
	}

}
