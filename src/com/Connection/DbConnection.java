
package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
public static Connection get_Connection() {
	Connection con=null;
	try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root","root");

}
catch(Exception e) {
	e.printStackTrace();
}
	return con;
}
}