/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author ESIC
 */
public class SuiviPoids {
    
    private User id ; 
    private Date date ; 
    private Double poids ; 

    public SuiviPoids() {
    }

    public SuiviPoids(User id, Date date, Double poids) {
        this.id = id;
        this.date = date;
        this.poids = poids;
    }

    public User getId() {
        return id;
    }

    public void setId(User id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }
    
 
    
}
