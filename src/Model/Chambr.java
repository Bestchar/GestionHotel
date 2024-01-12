/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JLabel;

/**
 *
 * @author charles_4545
 */
public class Chambr {
    private int num_Chambre;
    private String type;
    private String Caracteristique;
    private String Situation;
    private String Etat;
    private int prix;
    public Chambr(){
        
    }

    public Chambr(int num_Chambre, String type, String Caracteristique, String Situation, String Etat, int prix) {
        this.num_Chambre = num_Chambre;
        this.type = type;
        this.Caracteristique = Caracteristique;
        this.Situation = Situation;
        this.Etat = Etat;
        this.prix = prix;
    }

    public int getNum_Chambre() {
        return num_Chambre;
    }

    public void setNum_Chambre(int num_Chambre) {
        this.num_Chambre = num_Chambre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCaracteristique() {
        return Caracteristique;
    }

    public void setCaracteristique(String Caracteristique) {
        this.Caracteristique = Caracteristique;
    }

    public String getSituation() {
        return Situation;
    }

    public void setSituation(String Situation) {
        this.Situation = Situation;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String Etat) {
        this.Etat = Etat;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

   
    
}
