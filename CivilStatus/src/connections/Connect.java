/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import loginAndRegisiter.LoginAndRegisiter;

/**
 *
 * @author ITS
 */
public class Connect {

    private String url = "jdbc:mysql://localhost:3306/db_civil_status";
    private String user = "root";
    private String password = "";
    private LoginAndRegisiter loginAndRegisiter;
    private Connection conn;

    public Connection con() {
        try {
            return conn = (Connection) DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

}
