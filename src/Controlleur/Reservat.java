
package Controlleur;
import Model.Reservations;
import Model.Connect;
import Vu.Reservation;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static Vu.Client.id_client;
import com.toedter.calendar.JDateChooser;

 
public class Reservat {
    
 private Connection reservation;
 
 public Reservat(){
     reservation= Connect.connecter();
 }
   public boolean ajouterReservation(int id_client, int id_chambre, JDateChooser dateArriveChooser, JDateChooser dateDepartChooser, JDateChooser dateReserverChooser, int validite) {
        String sql = "INSERT INTO reservations (id_client, id_chambre, date_d_arrive, date_depart, date_reser, validiter) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = reservation.prepareStatement(sql)) {
            statement.setInt(1, id_client);
            statement.setInt(2, id_chambre);
            statement.setDate(3, new java.sql.Date(dateReserverChooser.getDate().getTime()));
            statement.setDate(4, new java.sql.Date(dateArriveChooser.getDate().getTime()));
            statement.setDate(5, new java.sql.Date(dateDepartChooser.getDate().getTime()));
            statement.setInt(6, validite);

            int rowsAffected = statement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
   }
}
