package Model;

public class ClientM {

    private String nom;
    private String Prenom;
    private String Nationalite;
    private int Telephone;
    private String Categorie;

    public ClientM() {

    }

    public ClientM(String nom, String Prenom, String Nationalite, int Telephone) {
        this.nom = nom;
        this.Prenom = Prenom;
        this.Nationalite = Nationalite;
        this.Telephone = Telephone;
        this.Categorie = Categorie;
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

    

}
