package com.satishsportsnetwork.serviceimpl;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.satishsportsnetwork.dao.Productdao;
import com.satishsportsnetwork.model.Product;

@Service
public class Productimpl implements Productdao 
{
@Autowired
SessionFactory sessionFactory;
public void addproduct(Product reg) {
System.out.println("Product dao");
//System.out.println(r.getId());
System.out.println(reg.getpname());
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

public void editproduct(int i) {
}

public void delproduct(int i) {

}
public void showproduct() {
}

public List<Product> getProducts() {
	Session session =sessionFactory.openSession();
	 Transaction transaction =  session.beginTransaction();
	List<Product> productList=null;
     try {
     productList= session.createQuery("from Product").list();   
 	    transaction.commit();                 
   }
  catch (Exception e) {
  transaction.rollback();
  e.printStackTrace();
   }
  session.close();
 return productList;
}
public void edit_list(Product adp){
	   Session session =sessionFactory.openSession();
	  // System.out.println("edit session"+session);
	 Transaction transaction =  session.beginTransaction();
	List<Product> editlist=null;
 try {
 	 int id=adp.getpid();
 	  // int pid=adp.getpid();
		   // System.out.println("id******"+id);
	        editlist=  session.createQuery("from Product where pid=:pid").setParameter("pid",id).list();
	    System.out.println("editlist *********"+editlist);
	        		     		       
	        editlist.get(0).setpid(adp.getpid());
	        editlist.get(0).setpname(adp.getpname());
	        editlist.get(0).setpdesc(adp.getpdesc());
	        editlist.get(0).setprate(adp.getprate());
	        editlist.get(0).setpbrand(adp.getpbrand());
	        editlist.get(0).setavailability(adp.getavailability());
	        session.saveOrUpdate(editlist.get(0));
	        transaction.commit();
	      }
 catch (Exception e) {
     transaction.rollback();
     e.printStackTrace();
	       }  
   session.close();
}

public Product single_object(int pid)
{
Session session =sessionFactory.openSession();
// System.out.println("single object session"+session);
Transaction transaction =  session.beginTransaction();
List<Product> b4=null;
	try
  {
	//String query=.list();
	//System.out.println(query);
  b4 =  session.createQuery("from Product where pid= :pid").setParameter("pid",pid).list();
 System.out.println("*****"+b4.get(0));
  transaction.commit();
  session.close();
              
}        
catch (Exception e) 
{
 transaction.rollback();
 e.printStackTrace();
}
 return b4.get(0);
}
public int deleteRow(int id) {  
Session session = sessionFactory.openSession();  
Transaction tx = session.beginTransaction();  
Product addpt = (Product) session.load(Product.class, id);  
session.delete(addpt);  
tx.commit();  
Serializable ids = session.getIdentifier(addpt);  
session.close();  0
return (Integer) ids;  
}



}
