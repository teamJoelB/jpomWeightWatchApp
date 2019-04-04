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
    /*
        List<SuiviPoids> Poids =  new ArrayList<>() ; 
        
        public static List<SuiviPoids> AllPoids() throws SQLException { 
        List<SuiviPoids> Poids =  new ArrayList<>() ; 
        String sql = "SELECT table_suivipoids.idUser, table_suivipoids.date, table_suivipoids.poidsA FROM table_suivipoids " ; 
        
        Connection Connexion = ConnectBd.getConnection(); 
        
        Statement req = Connexion.createStatement (); 
        
        ResultSet rs = req.executeQuery(sql) ; 
        
        while(rs.next())
        { 
           SuiviPoids p  = new SuiviPoids(); 
           User u = new User ();
            p.setId(rs.getString(("idUser"))); // on lui donne l'id de la bd 
            p.setDate(rs.getDate("date")) ; // on lui donne le nom de la bd
            p.setPoids(rs.getDouble("poidsA"));
            
            SuiviPoids.add(p); 
        }
            return SuiviPoids ;
       
        }*/
    
 
    
    
}
