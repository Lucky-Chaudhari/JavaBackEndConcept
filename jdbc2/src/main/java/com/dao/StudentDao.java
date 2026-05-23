package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentDao {
	
	public int inserStudent(Student s) {
		int result=0;
		Connection con=null;
		PreparedStatement pst=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			String sql="insert into student(name,city,percentage) value(?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1,s.getName());
			pst.setString(2, s.getCity());
			pst.setDouble(3, s.getPercentage());
			result=pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return result;
		
	}

	public int  deleteStudent(int id) {
		int result=0;
		Connection con=null;
		PreparedStatement pst=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			String sql="delete from student where id=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			result=pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	   return result;
	}
	
	public Student findStudentById(int id) 
	{
		Student s=null;
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		String sql="Select id,name,city,percentage from student where id=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1, id);
		rs=pst.executeQuery();
		while(rs.next()) 
		{
			s= new Student();
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setCity(rs.getString("city"));
			s.setPercentage(rs.getDouble("percentage"));
		}
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return s;
	}
	
	public List<Student> findAllStudent(){
		
		List<Student> list=new ArrayList();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			String sql="select id,name,city,percentage from student";
			pst=con.prepareStatement(sql);
			rs= pst.executeQuery();
			while(rs.next()){
				Student s1=new Student();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));
				s1.setCity(rs.getString("city"));
				s1.setPercentage(rs.getDouble("percentage"));
				list.add(s1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
		
	}
	public int updateStudent(Student s) {
		int result=0;
		Connection con=null;
		PreparedStatement pst=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			String sql="update Student set name=?,city=?,percentage=? where id=?";
			pst = con.prepareStatement(sql);
			pst.setString(1,s.getName());
			pst.setString(2, s.getCity());
			pst.setDouble(3, s.getPercentage());
			pst.setInt(4, s.getId());
			result=pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return result;
		
	}
}
