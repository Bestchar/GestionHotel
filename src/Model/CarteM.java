/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author charles_4545
 */
public class CarteM {
    private int id_carte;
    private int numerocarte;
    private int point_de_fidelite ;
    private  Date Date_de_delivrance ;
    private   Date  dateExpiration;
    public CarteM(){
    }

    public CarteM(int id_carte, int numerocarte, int point_de_fidelite, Date Date_de_delivrance, Date dateExpiration) {
        this.id_carte = id_carte;
        this.numerocarte = numerocarte;
        this.point_de_fidelite = point_de_fidelite;
        this.Date_de_delivrance = Date_de_delivrance;
        this.dateExpiration = dateExpiration;
    }

    public int getId_carte() {
        return id_carte;
    }

    public void setId_carte(int id_carte) {
        this.id_carte = id_carte;
    }

    public int getNumerocarte() {
        return numerocarte;
    }

    public void setNumerocarte(int numerocarte) {
        this.numerocarte = numerocarte;
    }

    public int getPoint_de_fidelite() {
        return point_de_fidelite;
    }

    public void setPoint_de_fidelite(int point_de_fidelite) {
        this.point_de_fidelite = point_de_fidelite;
    }

    public Date getDate_de_delivrance() {
        return Date_de_delivrance;
    }

    public void setDate_de_delivrance(Date Date_de_delivrance) {
        this.Date_de_delivrance = Date_de_delivrance;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    
}
