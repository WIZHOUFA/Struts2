package com.struts.ex;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class JDBCTools {
	private static JDBCTools instance=new JDBCTools();
	private JDBCTools(){}
	public static JDBCTools getInstance(){
		return instance;
	}
	public Connection getConnection(){
		InputStream is=getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		Properties pro =new Properties();
		try {
			pro.load(is);
			Class.forName(pro.getProperty("driverName"));
			Connection conn=DriverManager.getConnection(pro.getProperty("url"),
					pro.getProperty("username"), pro.getProperty("password"));
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public void release(Connection conn,Statement stm,ResultSet rs){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stm!=null){
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
