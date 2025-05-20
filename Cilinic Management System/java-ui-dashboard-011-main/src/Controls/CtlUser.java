/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Connect.ClsConnect;
import Interface.IUser;
import Models.MUser;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ITS
 */
public class CtlUser implements IUser {

    private ArrayList<MUser> array = new ArrayList<MUser>();

    @Override
    public ArrayList<MUser> qeuryLogin(String name) {
        array.clear();
        String sqlLogin = "Select * from tbl_users where Username = ?";
        try {
            PreparedStatement stmt = ClsConnect.con().prepareStatement(sqlLogin);
            stmt.setString(1, name);
            ResultSet set = stmt.executeQuery();
            while (set.next()) {
                array.add(new MUser(set.getInt("ID"), set.getString("Username"), set.getString("Password"), set.getString("Role"), set.getString("Full_name"), set.getString("Phone"), set.getTimestamp("Created_at").toLocalDateTime()));
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

    @Override
    public ArrayList<MUser> query() {
        array.clear();
        String sqlQeury = "Select * from tbl_users";
        try {
            PreparedStatement stmt = ClsConnect.con().prepareStatement(sqlQeury);
            ResultSet set = stmt.executeQuery();
            while (set.next()) {
                array.add(new MUser(set.getInt("ID"), set.getString("Username"), set.getString("Password"), set.getString("Role"), set.getString("Full_name"), set.getString("Phone"), set.getTimestamp("Created_at").toLocalDateTime()));
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

    @Override
    public void insert(MUser obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MUser objOld, MUser obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MUser getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
