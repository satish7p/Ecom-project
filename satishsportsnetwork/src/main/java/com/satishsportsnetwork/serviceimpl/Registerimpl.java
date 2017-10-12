package com.satishsportsnetwork.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.satishsportsnetwork.dao.Registerdao;
import com.satishsportsnetwork.model.Register;

@Service
public class Registerimpl implements Registerdao 
{
@Autowired
SessionFactory sessionFactory;
public void adduser(Register reg) {
System.out.println("Register dao");
//System.out.println(r.getId());
System.out.println(reg.getUsername());
//UserCredential uc=new UserCredential();
//uc.setUsername(r.getUsername());
//uc.setPassword(r.getPassword());
System.out.println("User Credentials");
try
{
Session session= sessionFactory.openSession();
Transaction tx=session.beginTransaction();
//tx.begin();
session.save(reg);
//session.save(uc);
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

}