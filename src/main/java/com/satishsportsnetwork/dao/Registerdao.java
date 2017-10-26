package com.satishsportsnetwork.dao;


import org.springframework.stereotype.Service;

import com.satishsportsnetwork.model.Register;
import com.satishsportsnetwork.model.UserCredential;

@Service("registerdao")
public interface Registerdao
{
public void adduser(Register r);
public void edituser(int i);
public void getinfo();
public void deluser(int i);
public void showuser();
UserCredential getuserid(String userid);
}


