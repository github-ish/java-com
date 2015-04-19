package com.java.dao;


import java.sql.*;
import java.util.*;
import com.java.model.User;
import com.java.database.Database;
 
public class Userdao {
 
    private Connection connection;
 
    public Userdao() {
        connection = Database.getConnection();
    }
 
   
    public User getUserById(String userId,String pass) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from USER where username=? and password=?");
            
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, pass);
            System.out.println(preparedStatement+userId+pass);
            ResultSet rs = preparedStatement.executeQuery();
 
            if (rs.next()) {
            	System.out.println("yey");
            	user.setUsername(rs.getString("username"));
            	user.setPassword(rs.getString("password"));
            	user.setType(rs.getString("DTYPE"));
            	//System.out.println(user.getUsername());
            	//System.out.println(rs.getString("password"));
               /* user.setUname(rs.getString("uname"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setRegisteredon(rs.getDate("registeredon"));*/
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return user;
    }
}
