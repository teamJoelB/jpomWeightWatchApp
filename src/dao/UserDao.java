/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ESIC
 */
public class UserDao {
     public static User getbyLoginPass(String login, String mdp) 
   throws SQLException { 
        
        User u = null ; 
        
        String sql = "SELECT * FROM user WHERE mail=? AND mdp=?"; 
        
        Connection connexion = ConnectBd.getConnection() ; 
        
        PreparedStatement ordre = connexion.prepareStatement(sql);
        
        ordre.setString(1,login); 
        ordre.setString(2,mdp); 
        
        ResultSet rs = ordre.executeQuery() ; 
        
        if (rs.next()) { // rs.next : vaut true si on arrive à récuperer une donnée dans la bd. S'il vaut TRUE, 
            u = new User(); //on crée un utilisateur
            u.setId(rs.getInt("id")); // on lui donne l'id de la bd 
            u.setNom(rs.getString("nom")) ; // on lui donne le nom de la bd
            u.setPrenom(rs.getString("prenom"));
            u.setMail(rs.getString("mail")); 
            u.setAge(rs.getString("age")); 
            u.setSexe(rs.getString("sexe")); 
            u.setTaille(rs.getString("taille")); 
            u.setPoids(rs.getDouble("poids")); 
        }
        
        return u; 
    } 
    
}
