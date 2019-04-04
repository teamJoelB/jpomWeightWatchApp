/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.SuiviPoids;
import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ESIC
 */
public class SuiviPoidsDao {
    
    
       
        
     public static void insertPoids(SuiviPoids p) throws SQLException {
        String sql = "INSERT INTO table_suivipoids (idUser, date, poidsA) VALUES (?,?,?) "; 
        Connection Connexion = ConnectBd.getConnection(); 
        User u = new User();
        PreparedStatement ordre = Connexion.prepareStatement(sql) ; 
        ordre.setInt(1, u.getId());
        //ordre.setDate(2, p.getDate()); 
        ordre.setDouble(3, p.getPoids());
        
               
        ordre.execute() ; 
        
    } 

}
