package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
       //Jdbc Connections Step 
    //Step 1 First Load Driver with the help of Driver Class class
    //Step 2 Make connection by using getconnection methods of DriverManagerClass
    //Step 3 Create query
    //Step 4 Create Statment for to convert qeury into statment	by using createstatment ,preparedstatements
   //Step 5 Exceute statment Using 	executeUpdate,executeQuery
    	//Step 6 Close connection
    	Connection con =null;
    	PreparedStatement pst=null;
    	int Check = 0;
         try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		     String sql="insert into t1(name,marks,address)value(?,?,?)";
		    pst= con.prepareStatement(sql);//PrepareStatements implemets PrepareStatements interface
		    pst.setString(1, "Khushi");
		    pst.setInt(2, 60);
		    pst.setString(3,"Amt");
		    Check =pst.executeUpdate();//ExcuteUpdate use :-Create,Delete,Update Query
		 } catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		 }finally
         {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
         }
         System.out.println(Check);
    }
}
