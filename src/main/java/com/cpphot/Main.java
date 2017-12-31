package com.cpphot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.cpphot.DO.UserDO;
import com.cpphot.dao.UserDao;

public class Main {
	public static void main(String args[]) throws SQLException {
		UserDao dao=new UserDao();
		UserDO user=new UserDO();
		user.setName("hi");
		//dao.save(user);
		System.out.println(dao.list());
	}
}
