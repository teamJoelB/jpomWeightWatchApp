/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ESIC
 */
public class ConnectBd {
    protected static final String DRIVER_NAME = "com.mysql.jdbc.Driver"; 
    protected static final String DB_NAME = "wwabd"; 
    protected static final String URL = "jdbc:mysql://localhost/" + DB_NAME; 
    protected static final String USER = "root" ;
    protected static final String PASSWORD = "" ;
    
    public static Connection getConnection() throws SQLException{ 
        return DriverManager.getConnection(URL, USER, PASSWORD); // connect à la base de données avec le bon url, user, password
    }
    
}
