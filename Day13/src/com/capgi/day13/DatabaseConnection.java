package com.capgi.day13;
import java.sql.*;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static void main(String[] args) {
		Connection c=null;
		try {
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","root");
			System.out.println("connected successfully");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("Select * from public.emp");
			while(rs.next()) {
				System.out.println("Employee id:"+rs.getInt(1));
				System.out.println("Employee name:"+rs.getString(2));
				

			}
			if(c!=null)
			{
				rs.close();
				st.close();
				c.close();
			}

			}
		catch(Exception e) {
			System.out.println(e.getClass().getName()+":"+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		
	}
}
