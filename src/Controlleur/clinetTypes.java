
package Controlleur;
import Model.ClientM;
import Model.Connect;
import static Model.Connect.connecter;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author charles_4545
 */
public class clinetTypes {
 Connection client = Connect.connecter();
    ResultSet typ = null;
    PreparedStatement ty ;
    String Insert = "INSERT INTO clients (nom,prenom,origne,numero_de_telephone)VALUES(?,?,?,?)";

    
}
