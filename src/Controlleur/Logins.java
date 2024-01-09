/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlleur;

import Model.LoginM;
import Model.Connect;
import Vu.Login;
import java.sql.*;
public class Logins {
    private Connection login;
    public Logins(){
        login=Connect.connecter();
       
    }
    
    
}
