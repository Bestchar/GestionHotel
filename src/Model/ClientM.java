package Model;

import java.sql.PreparedStatement;

public class ClientM {

    private String nom;
    private String Prenom;
    private String Nationalite;
    private int Telephone;
    private String Categorie;
    private String Photo;

    public ClientM() {
      
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    

    public ClientM(String nom, String Prenom, String Nationalite, int Telephone,String Photo) {
        this.nom = nom;
        this.Prenom = Prenom;
        this.Nationalite = Nationalite;
        this.Telephone = Telephone;
        this.Categorie = Categorie;
          this.Photo = Photo;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getOrigine() {
        return Nationalite;
    }

    public void setNationalite(String Nationalite) {
        this.Nationalite = Nationalite;
    }

    public String getTelephone() {
    return String.valueOf(Telephone); // Convertit le numéro de téléphone en String
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String Categorie) {
        this.Categorie = Categorie;
    }

    public Object getId_client() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getPhotoInputStream() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getPhotoPath() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
