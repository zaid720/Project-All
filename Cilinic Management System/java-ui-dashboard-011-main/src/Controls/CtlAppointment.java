/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Connect.ClsConnect;
import Interface.IAppointment;
import Models.MAppointment;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ITS
 */
public class CtlAppointment implements IAppointment {

    private ArrayList<MAppointment> array = new ArrayList<MAppointment>();
    
    @Override
    public Integer count() {
        return query().size();
    }

    @Override
    public ArrayList<MAppointment> query() {
        array.clear();
        try {
            String sql = "select * from tbl_appointments";
            PreparedStatement stmt = ClsConnect.con().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                array.add(new MAppointment(rs.getInt("ID"), rs.getInt("Patient_id"), rs.getInt("Doctor_id"), rs.getDate("Appointment_date").toLocalDate(), rs.getTime("Appointment_time").toLocalTime(), rs.getString("Status"), rs.getTimestamp("Created_at").toLocalDateTime()));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return array;
    }

    @Override
    public void insert(MAppointment obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MAppointment objOld, MAppointment obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MAppointment getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
