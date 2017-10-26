package com.satishsportsnetwork.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.satishsportsnetwork.model.Product;

@Service("Productdao")
public interface Productdao
{
public void addproduct(Product r);
public void editproduct(int i);
public void delproduct(int i);
public void showproduct();
public List<Product> getProducts();
}



