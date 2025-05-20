/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Connect.ClsConnect;
import Interface.IVisit;
import Models.MVisit;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ITS
 */
public class CtlVisit implements IVisit {

    ArrayList<MVisit> array = new ArrayList<MVisit>();
    
    @Override
    public Integer count() {
        return query().size();
    }

    @Override
    public ArrayList<MVisit> query() {
        array.clear();
        try {
            String sql = "select * from  tbl_visits";
            PreparedStatement stmt = ClsConnect.con().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                array.add(new MVisit(rs.getInt("ID"), rs.getInt("Appointment_id"), rs.getInt("Doctor_id"), rs.getDate("Visit_Date").toLocalDate(), rs.getString("Diagnosis"), rs.getString("Notes"), rs.getTimestamp("Created_at").toLocalDateTime()));
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return array;
    }

    @Override
    public void insert(MVisit obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MVisit objOld, MVisit obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MVisit getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
