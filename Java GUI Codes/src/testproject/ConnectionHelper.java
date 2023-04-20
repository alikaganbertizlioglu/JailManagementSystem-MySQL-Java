/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alika
 */
public class ConnectionHelper {
    private String username;
    private String password;
    private String url="jdbc:mysql://localhost:3306/jailmanagementsystem";

    public ConnectionHelper(String username,String password){
        this.username=username;
        this.password=password;
            try {

               Class.forName("com.mysql.cj.jdbc.Driver");
             } catch (ClassNotFoundException e) 
                    {
		// TODO Auto-generated catch block
		System.err.println("Unable to load MySQL Driver");
		}
		
    }
    	
	
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,username,password);
                        System.out.println("AMELE LOGU : Connection Succesfull");
                       
		} catch (SQLException e) {
			// TODO Auto-generated catch block
                        
		          System.out.println("AMELE LOGU ERROR :"+ e.getMessage());
		}
		return connection;
		
	}
}
