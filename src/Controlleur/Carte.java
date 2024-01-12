package Controlleur;

import Model.CarteM;
import Model.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Carte {
    private Connection Cartes;

    public Carte() {
        Cartes = Connect.connecter();
    }

    public boolean ajouterCarteFidelite(CarteM carte) {
        try {
            // Pas besoin de Connect.connecter() ici car la connexion est déjà établie dans le constructeur

            PreparedStatement statementCarte = Cartes.prepareStatement("INSERT INTO carte_de_Fidelite (numerocarte, point_de_fidelite, Date_de_delivrance, dateExpiration) VALUES (?, ?, ?, ?)");

            statementCarte.setInt(1, carte.getNumerocarte());
            statementCarte.setInt(2, carte.getPoint_de_fidelite());

            // Conversion de java.util.Date en java.sql.Date
            java.util.Date utilDateDelivrance = carte.getDate_de_delivrance();
            java.sql.Date sqlDateDelivrance = new java.sql.Date(utilDateDelivrance.getTime());
            statementCarte.setDate(3, sqlDateDelivrance);

            java.util.Date utilDateExpiration = carte.getDateExpiration();
            java.sql.Date sqlDateExpiration = new java.sql.Date(utilDateExpiration.getTime());
            statementCarte.setDate(4, sqlDateExpiration);

            statementCarte.executeUpdate();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
