package com.Controoler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.User;
import com.Dao.Student;


@WebServlet("/co")
public class Controller extends HttpServlet {
	User user=new User();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//int	id=Integer.parseInt(request.getParameter("id"));
	String	name=request.getParameter("name");
	String	Address=request.getParameter("address");
	String	Dob=request.getParameter("dob");
	String	course=request.getParameter("course");
	String	joing=request.getParameter("joing");
	
	String button = request.getParameter("submit");
	System.out.println(button);
	
	//User user=new User();
	//user.setId(id);
	user.setName(name);
	user.setAddress(Address);
	user.setDob(Dob);
	user.setCourse(course);
	user.setJoing(joing);
	Student st=new Student();
	System.out.println(user);
	//st.Insert(user);
	st.Fetch();
	if(button.equals("submit")) {
		System.out.println("insert");
		st.Insert(user);
	}
	else {
	st.Update(user);
	}
	response.sendRedirect("index.jsp");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		int id=Integer.parseInt(request.getParameter("id"));
		user.setId(id);
		Student st= new Student();
		st.delete(user);
		response.sendRedirect("index.jsp");
	}
}
