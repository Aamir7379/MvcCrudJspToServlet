package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Bean.User;
import com.Connection.DbConnection;

public class Student {
public void Insert(User user) {
	Connection con=null;
	try {
		con=DbConnection.get_Connection();
		PreparedStatement ps=con.prepareStatement("insert into Student values(?,?,?,?,(select SYSDATE() from dual))");
		//ps.setInt(1,0);
		ps.setString(1,user.getName());
		ps.setString(2,user.getAddress());
		ps.setString(3,user.getDob());
		ps.setString(4,user.getCourse());
		ps.executeUpdate();
	}
	catch (Exception e) {
	e.printStackTrace();
	}
}
public static List<User> Fetch(){
	
		List<User>li=new ArrayList<User>();
	try {
		Connection con=null;
		con=DbConnection.get_Connection();
		PreparedStatement ps=con.prepareStatement("select * from Student");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		User user=new User();
		//user.setId(rs.getInt(1));
		user.setName(rs.getString(1));
		user.setAddress(rs.getString(2));
		user.setDob(rs.getString(3));
		user.setCourse(rs.getString(4));
		user.setJoing(rs.getString(5));
		li.add(user);
		
		}
	}
	catch (Exception e) {
		e.printStackTrace();

	}
	
	return li;
	
}
public void delete(User user) {
	try {
		Connection con=null;
		con=DbConnection.get_Connection();
		PreparedStatement ps=con.prepareStatement("delete from Student where id=?");
		ps.setInt(1,user.getId());
		ps.executeUpdate();
		ps.close();
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
public void Update(User user) {
	try {
		System.out.println(user);
		Connection con=null;
		con=DbConnection.get_Connection();
		PreparedStatement ps=con.prepareStatement("update Student set name=?,address=?,Dob=?,course=? where id=?");
		ps.setString(1,user.getName());
		ps.setString(2,user.getAddress());
		ps.setString(3,user.getDob());
		ps.setString(4,user.getCourse());
		ps.setInt(5,user.getId());
		ps.executeUpdate();
		ps.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
