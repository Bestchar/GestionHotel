package Controlleur;

import Model.Chambr;
import Model.Connect;
import Vu.Chambres;
import static Vu.Chambres.id_chambre;
import java.sql.*;

public class Chambre {

    Connection connection = Connect.connecter();
    PreparedStatement statment = null;
    ResultSet result;

    public Chambre() {
    }

    public Chambre(Connection connection, PreparedStatement statment, ResultSet result) {
        this.connection = connection;
        this.statment = statment;
        this.result = result;
    }

    public boolean ajouterChambre(Chambr chambre) {

        try {

            String sql = "INSERT INTO Chambres(NUM_Chambre, type, caracteristique, situation, tarif, Etat_Chambre) VALUES (?, ?, ?, ?,?,'Libre')";
            statment = connection.prepareStatement(sql);

            // Remplacez les points d'interrogation par les valeurs de votre objet Chambr
            statment.setInt(1, chambre.getNum_Chambre());
            statment.setString(2, chambre.getType());
            statment.setString(3, chambre.getCaracteristique());
            statment.setString(4, chambre.getSituation());
            statment.setInt(5, chambre.getPrix()); // Utilisez setDouble pour les tarifs décimaux

            // Exécutez la requête d'insertion
            statment.executeUpdate();

            // Vérifiez si l'insertion a réussi (au moins une ligne a été affectée)
            return true;
        } catch (Exception e) {
            e.printStackTrace(); // Gérez l'exception de manière appropriée dans votre application
            return false;
        }
    }

    public boolean DeleteChambre(int id_chambre) {
        String sql = "DELETE FROM Chambres WHERE id_chambre=?";

        try (PreparedStatement statment = connection.prepareStatement(sql)) {
            statment.setInt(1, id_chambre);

            statment.executeUpdate();

            // Vérifier si la suppression a été effectuée avec succès
            return true; // La suppression a réussi

            // Aucune ligne n'a été supprimée (ID introuvable)
        } catch (Exception ex) {
            ex.printStackTrace(); // Gestion appropriée des exceptions à ajouter
            return false; // Une exception s'est produite lors de la suppression
        }
    }

    public boolean modiChambre(Chambr chambre) {
        try {
            // Utilisez la requête SQL avec "libre" comme valeur par défaut pour "Etat_Chambre"
            String sql = "UPDATE Chambres SET type=? ,caracteristique=? ,situation=? ,tarif=? ,NUM_Chambre=? ,Etat_Chambre=?  WHERE id_chambre=?";
            statment = connection.prepareStatement(sql);

            // Remplacez les points d'interrogation par les valeurs de votre objet Chambr
            statment.setString(1, chambre.getType());
            statment.setString(2, chambre.getCaracteristique());
            statment.setString(3, chambre.getSituation());
            statment.setInt(4, chambre.getPrix()); 
            statment.setInt(5, chambre.getNum_Chambre()); // Utilisez setDouble pour les tarifs décimaux
            statment.setString(6, chambre.getEtat());
            statment.setInt(7, Integer.parseInt(Chambres.id_chambre)); // Utilisez setDouble pour les tarifs décimaux
// Utilisez setDouble pour les tarifs décimaux

// Utilisez setDouble pour les tarifs décimaux

            // Exécutez la requête d'insertion
            statment.executeUpdate();
            return true;
            // Vérifiez si l'insertion a réussi (au moins une ligne a été affectée)
        } catch (Exception e) {
            e.printStackTrace(); // Gérez l'exception de manière appropriée dans votre application
            return false;
        }
    }
}
