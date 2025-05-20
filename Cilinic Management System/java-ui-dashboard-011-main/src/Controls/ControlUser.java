/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Connect.ClsConnect;
import Models.ModelUser;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ITS
 */
public class ControlUser {

    private ArrayList<ModelUser> array = new ArrayList<>();
    private String sqlLogin = "Select * from tbl_users where Username = ?";
    private String sqlQeury = "Select * from tbl_users";

    public ArrayList<ModelUser> qeuryLogin(String name) {
        array.clear();
        try {
            PreparedStatement stmt = ClsConnect.con().prepareStatement(sqlLogin);
            stmt.setString(1, name);
            ResultSet set = stmt.executeQuery();
            while (set.next()) {
                array.add(new ModelUser(set.getInt("ID"), set.getString("Username"), set.getString("Password"), set.getString("Role"), set.getString("Full_name"), set.getString("Phone"), set.getTimestamp("Created_at").toLocalDateTime()));
            }
            ClsConnect.con().close();
            stmt.close();
            set.close();
            return array;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return null;
    }
    public ArrayList<ModelUser> qeury() {
        array.clear();
        try {
            PreparedStatement stmt = ClsConnect.con().prepareStatement(sqlQeury);
            ResultSet set = stmt.executeQuery();
            while (set.next()) {
                array.add(new ModelUser(set.getInt("ID"), set.getString("Username"), set.getString("Password"), set.getString("Role"), set.getString("Full_name"), set.getString("Phone"), set.getTimestamp("Created_at").toLocalDateTime()));
            }
            ClsConnect.con().close();
            stmt.close();
            set.close();
            return array;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return null;
    }

}
