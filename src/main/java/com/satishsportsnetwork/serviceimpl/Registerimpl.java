package com.satishsportsnetwork.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.satishsportsnetwork.dao.Registerdao;
import com.satishsportsnetwork.model.Register;
import com.satishsportsnetwork.model.UserCredential;

@Service
public class Registerimpl implements Registerdao 
{

@Autowired
	SessionFactory sessionFactory;
	public void adduser(Register r) {
		//System.out.println("Register DAO");
		//System.out.println(r.getId());
		//System.out.println(r.getName());
		UserCredential uc=new UserCredential();
		uc.setName(r.getUsername());
	    uc.setPassword(r.getPassword());
	    uc.setRole("ROLE_USER");
		//System.out.println("User Credentials");
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(r);
		session.save(uc);
		tx.commit();
		session.flush();
		session.close();
		} 
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}		
	}

public void edituser(int i) {
}

public void deluser(int i) {

}
public void showuser() {
}


public void getinfo() {
	
	
}
public UserCredential getuserid(String userid)
{
	return getuserid(userid);
}

}
