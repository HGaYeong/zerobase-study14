package com.sqliet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class WIFI_DBinput {

	public static void main(String[] args) {
		 Connection connection = null;
	        PreparedStatement pstm = null;
	        String sql = "insert into person values (? , ?)";

	        try {
	            //Class.forName("org.sqlite.JDBC");
	            connection = DriverManager.getConnection("jdbc:sqlite:WIDI_DB.db");
	            int id  = 3;
	            String name = "park";

	            pstm = connection.prepareStatement(sql);
	            pstm.setInt(1, id);
	            pstm.setString(2, name);
	            int res =pstm.executeUpdate();

	            if(res > 0 ) {
	                System.out.println("DB입력 성공");
	            }else {
	                System.out.println("DB입력 실패");
	            }

	            connection.close(); 
	        }
	        catch(SQLException e)
	        {
	            System.err.println(e.getMessage());
	        }
	    }
	}