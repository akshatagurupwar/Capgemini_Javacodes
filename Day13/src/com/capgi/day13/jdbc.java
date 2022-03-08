package com.capgi.day13;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class jdbc {
	
	
	
	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","root");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select * from emp");
		while(rs.next()) {
			System.out.println("Employee id:"+rs.getInt(1));
			System.out.println("Employee name:"+rs.getString(2));
			

		}
		
	}

}
