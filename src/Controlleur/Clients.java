
package Controlleur;
import Model.ClientM;
import Model.Connect;
import java.sql.*;

/**
 *
* @author charles_4545
 */
public class Clients {
     private Connection client;
     public Clients(){
      client = Connect.connecter();
     }
     public boolean add(ClientM ajou) {
        try {
            PreparedStatement cl = client.prepareStatement("INSERT INTO clients (nom, prenom, origne, numero_de_telephone,Categorie) VALUES (?, ?, ?, ?,?)");
            cl.setString(1, ajou.getNom());
            cl.setString(2, ajou.getPrenom()); // Assuming you have getters for other fields
            cl.setString(3, ajou.getOrigine());
            cl.setString(4, ajou.getTelephone());
            cl.setString(5,ajou.getCategorie());
            return cl.executeUpdate() > 0; // Check if insertion succeeded
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
            return false;
        }
    }
}
