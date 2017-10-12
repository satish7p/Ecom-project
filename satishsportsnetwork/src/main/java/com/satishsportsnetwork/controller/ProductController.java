package com.satishsportsnetwork.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.satishsportsnetwork.model.Product;
import com.satishsportsnetwork.serviceimpl.Productimpl;



@Controller("Productcontroller")
public class ProductController 
{
	
	@Autowired
	Productimpl rdao;
	@RequestMapping(value="Product", method=RequestMethod.GET)
	public ModelAndView getLogin(@ModelAttribute("Product")Product Product)
	{
			System.out.println("Product");	
			ModelAndView model=new ModelAndView("Product");
			return model;
	}
			@RequestMapping(value="Product", method=RequestMethod.POST)
	public ModelAndView Success(Product reg, Model m)
	{
		
			rdao.addproduct(reg);
			
			ModelAndView model=new ModelAndView("ViewProduct","Product", new Product());
		
			return new ModelAndView("redirect:ViewProduct");
	}
			@RequestMapping(value="ViewProduct", method=RequestMethod.GET)
		    public ModelAndView listOfTeams() {
			 //AddProduct addp=new AddProduct();
		        ModelAndView modelAndView = new ModelAndView("ViewProduct");
		         	        List<Product> teams = rdao.getProducts();
		         	        //System.out.println("obj:"+teams);
		        modelAndView.addObject("lists", teams);
		        	        return modelAndView;
		    }
			  
			 @RequestMapping("EditProduct/{pid}")  
			 public ModelAndView editUser(@PathVariable int pid) {  
			  Product apobj = rdao.single_object(pid);  
			  return new ModelAndView("EditProduct", "command",apobj );  
			 }  
			
			 @RequestMapping(value="EditProduct/update",method=RequestMethod.POST)  
			 public ModelAndView updateUser(@ModelAttribute("apobj") Product adp) {  
			  rdao.edit_list(adp);  
			  return new ModelAndView("redirect:http://localhost:8080/satishsportsnetwork/ViewProduct");  
			 }  	
			 @RequestMapping(value="delete/{pid}",method=RequestMethod.POST)  
			 public ModelAndView deleteUser(@PathVariable int pid) {  
			  rdao.deleteRow(pid);  
			  return new ModelAndView("redirect:http://localhost:8080/satishsportsnetwork/ViewProduct");  
			 }  
}



