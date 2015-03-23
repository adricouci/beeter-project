package edu.upc.eetac.dsa.acouceiro.beeter_api.beeter.api.model;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;

public class UserCollection {
	private List<Link> links;
	private List<User> users;
	
	public UserCollection(){
		super();
		users = new ArrayList<>();
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void addUser(User user){
		users.add(user);
	}
}
