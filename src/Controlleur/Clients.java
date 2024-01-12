package Controlleur;

import Model.CarteM;
import Model.ClientM;
import Model.Connect;
import Vu.Client;
import static Vu.Client.id_client;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

/**
 *
 * @author charles_4545
 */
public class Clients {
    public static String path;
    public static String id;
    public static InputStream is;

    private Connection client;

    public Clients() {
        client = Connect.connecter();

    }


    public boolean set(ClientM ajou){
        try {
            PreparedStatement cl = client.prepareStatement("UPDATE clients SET nom=?, prenom=?, origne=?, numero_de_telephone=?, Categorie=? WHERE id_client=?");
            cl.setString(1, ajou.getNom());
            cl.setString(2, ajou.getPrenom()); // Assuming you have getters for other fields
            cl.setString(3, ajou.getOrigine());
            cl.setString(4, ajou.getTelephone());
            cl.setString(5, ajou.getCategorie());
            int id=Integer.parseInt(Client.id_client);
            cl.setInt(6, id);
            cl.executeUpdate();
            // connection.close();
            return true; // Check if insertion succeeded
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
            return false;
        }
    }

    public boolean supprimerClient(String id_client) {
        String sql = "DELETE FROM clients WHERE id_client=?";

        try (PreparedStatement statement = client.prepareStatement(sql)) {
            statement.setString(1, id_client);

            int rowsAffected = statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace(); // Gestion appropriée des exceptions à ajouter
            return false;
        }
    }
   public boolean add(ClientM ajou) throws IOException {
    try {
        // Prépare la requête SQL avec des paramètres précompilés pour éviter les injections SQL
        PreparedStatement cl = client.prepareStatement("INSERT INTO clients (nom, prenom, origine, numero_de_telephone, Categorie, photo) VALUES (?, ?, ?, ?, ?, ?)");

        // Remplace les paramètres par les valeurs réelles
        cl.setString(1, ajou.getNom());
        cl.setString(2, ajou.getPrenom());
        cl.setString(3, ajou.getOrigine());
        cl.setString(4, ajou.getTelephone());
        cl.setString(5, ajou.getCategorie());

        // Assurez-vous que 'is' et 'path' ne sont pas null avant d'essayer de les utiliser
        if (ajou.getPhotoInputStream() != null && ajou.getPhotoPath() != null) {
            try {
                // Utilisez la classe FileInputStream pour lire le fichier photo
                FileInputStream photoStream = new FileInputStream(new File((String) ajou.getPhotoPath()));
                // Utilisez setBinaryStream pour LONGBLOB
                cl.setBinaryStream(6, photoStream, photoStream.available());
            } catch (FileNotFoundException e) {
                // Log or handle the exception appropriately
                cl.setNull(6, java.sql.Types.BLOB);
            }
        } else {
            // Si la photo ou le chemin de la photo est null, vous pouvez décider de ne pas la sauvegarder dans la base de données
            cl.setNull(6, java.sql.Types.BLOB);
        }

        // Exécute la mise à jour et vérifie si l'insertion a réussi
        return cl.executeUpdate() > 0;
    } catch (SQLException | IOException e) {
        e.printStackTrace(); // Log or handle the exception appropriately
        return false;
    }
}



}
