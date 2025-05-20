/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Connect.ClsConnect;
import Interface.IPatient;
import Models.MPatient;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ITS
 */
public class CtlPatient implements IPatient {

    private ArrayList<MPatient> array = new ArrayList<MPatient>();
    private ArrayList<String[]> list = new ArrayList<String[]>();
    
    @Override
    public void insert(MPatient obj) {

    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public void update(MPatient objOld, MPatient obj) {

    }

    @Override
    public MPatient getById(Integer id) {
        return null;
    }

    @Override
    public ArrayList<String[]> upcomingAppointments() {
        list.clear();
        try {
            String sql = "select tbl_patients.Full_name, tbl_appointments.Appointment_date, tbl_appointments.Status from tbl_patients Inner Join tbl_appointments on tbl_patients.ID = tbl_appointments.Patient_id";
            PreparedStatement stmt = ClsConnect.con().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                if (rs.getString("Status").equalsIgnoreCase("قادم"))
                list.add(new String[]{rs.getString("Full_name"), rs.getString("Appointment_date")});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public ArrayList<MPatient> query() {
        array.clear();
        String sql = "select * from tbl_patients";
        try {
            PreparedStatement stmt = ClsConnect.con().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                array.add(new MPatient(rs.getInt("ID"), rs.getString("Full_name"), rs.getInt("Age"), rs.getString("Gender"), rs.getString("Phone"), rs.getString("Address"), rs.getString("Medication_notes"), rs.getTimestamp("Created_at").toLocalDateTime()));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return array;
    }

    @Override
    public Integer count() {
        return query().size();
    }

}
