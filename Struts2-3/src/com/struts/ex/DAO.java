package com.struts.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class DAO {
	public List<Department> getDepartments(){
		JDBCTools tool=JDBCTools.getInstance();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		conn=tool.getConnection();
		List<Department> list=new ArrayList<Department>();
		try {
			ps=conn.prepareStatement("select departmentID,departmentName from department");
			rs=ps.executeQuery();
			while(rs.next()){
				list.add(new Department(rs.getInt(1),rs.getString(2)));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public List<Role> getRoles(){
		JDBCTools tool=JDBCTools.getInstance();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		conn=tool.getConnection();
		List<Role> list=new ArrayList<Role>();
		try {
			ps=conn.prepareStatement("select roleID,roleName from role");
			rs=ps.executeQuery();
			while(rs.next()){
				list.add(new Role(rs.getInt(1),rs.getString(2)));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
