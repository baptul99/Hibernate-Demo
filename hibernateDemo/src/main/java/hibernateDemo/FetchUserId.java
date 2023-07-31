package hibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchUserId {

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
System.out.println("Enter your id to find details:");
int id =s.nextInt();
EntityManager manager= Persistence.createEntityManagerFactory("devv").createEntityManager();
user u=manager.find(user.class, id);
if(u!=null)
{
	System.out.println("id:"+u.getId());
	System.out.println("Name:"+u.getName());
	System.out.println("phone:"+u.getPhone());
	System.out.println("password:"+u.getPassword());
	
}else {
	System.err.println("Number not valid");
}
	}

}
