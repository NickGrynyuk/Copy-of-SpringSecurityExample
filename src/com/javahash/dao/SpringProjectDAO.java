package com.javahash.dao;

import java.util.List;

import com.javahash.entity.Golden;
import com.javahash.entity.Client;
import com.javahash.entity.Silver;

import com.javahash.entity.Bronzes;
import com.javahash.entity.User;


public interface SpringProjectDAO {
	
	public List<Bronzes> readBronzes();
	public void addInformation(Bronzes bronzes);
	
	public List<Silver> readSilver();
	public void addInformation(Silver silver);

	
	public List<Golden> readGolden();
	public void addInformation(Golden golden);
	
	public List<User> readUser();
	public void addInformation(User users);
	
	public List<Client> readClient();
	public void addInformation(Client client);
}
