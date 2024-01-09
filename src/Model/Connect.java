package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    public static Connection connecter() {
        Connection conn = null;
        try {
            // Création d’une instance de l’objet driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DRIVER OK ! ");

            String url = "jdbc:mysql://localhost:3306/Gestion_Hotel";
            String user = "root";
            String passwd = "";

            // Assigner la connexion à la variable conn
           conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connection effective !");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String args[]) {
        Connect con = new Connect();
        con.connecter();
    }
}
