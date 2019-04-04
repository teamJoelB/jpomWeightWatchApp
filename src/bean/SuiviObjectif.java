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
public class SuiviObjectif {
   // id/ dateD/ statut(prise ou perte)/ poidsO/ dateF
    
    private User id ; 
    private Date dateD ; 
    private String statut ; 
    private double poidsO ; 
    private Date dateF ; 

    public SuiviObjectif() {
    }

    public SuiviObjectif(User id, Date dateD, String statut, double poidsO, Date dateF) {
        this.id = id;
        this.dateD = dateD;
        this.statut = statut;
        this.poidsO = poidsO;
        this.dateF = dateF;
    }

    public User getId() {
        return id;
    }

    public void setId(User id) {
        this.id = id;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public double getPoidsO() {
        return poidsO;
    }

    public void setPoidsO(double poidsO) {
        this.poidsO = poidsO;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }
    
    
}
