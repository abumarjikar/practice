package com.abhi.test;

import java.util.ArrayList;
import java.util.List;

public class Company {

	public List<User> getUserList() {

		User s1 = new User(1, "AB", 25);
		User s2 = new User(2, "AB2", 65);
		User s3 = new User(3, "AB3", 24);
		List<User> userList = new ArrayList<User>();
		userList.add(s1);
		userList.add(s2);
		userList.add(s3);

		return userList;
	}

}
