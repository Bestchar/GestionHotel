/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlleur;

/**
 *
 * @author charles_4545
 */
public class Chambre {
    private int num_Chambre;
    private String tp_Chambre;
    private String Caracteristique;
    private String Situation;
    private String Type;
       public Chambre() {
    }

    public Chambre(int num_Chambre, String tp_Chambre, String Caracteristique, String Situation, String Type) {
        this.num_Chambre = num_Chambre;
        this.tp_Chambre = tp_Chambre;
        this.Caracteristique = Caracteristique;
        this.Situation = Situation;
        this.Type = Type;
    }
    

    public int getNum_Chambre() {
        return num_Chambre;
    }

    public void setNum_Chambre(int num_Chambre) {
        this.num_Chambre = num_Chambre;
    }

    public String getTp_Chambre() {
        return tp_Chambre;
    }

    public void setTp_Chambre(String tp_Chambre) {
        this.tp_Chambre = tp_Chambre;
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

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    
}
