/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ITS
 */
public class ClsConnect {
    
    private static String url = "jdbc:mysql://localhost:3306/clinicmanagementsystem";
    private static String user = "root";
    private static String password = "";
    
    public static Connection con(){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
    
}
