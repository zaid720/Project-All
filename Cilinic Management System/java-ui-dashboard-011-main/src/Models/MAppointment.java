/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import personal.Personal;

/**
 *
 * @author ITS
 */
public class MAppointment extends Personal {
    private int patient_id, doctor_id;
    private LocalDate appointment_date;
    private LocalTime appointment_time;
    private String status;

    public MAppointment(int id, int patient_id, int doctor_id, LocalDate appointment_date, LocalTime appointment_time, String status, LocalDateTime created_at) {
        super(id, created_at);
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.appointment_date = appointment_date;
        this.appointment_time = appointment_time;
        this.status = status;
    }

    public MAppointment(int patient_id, int doctor_id, LocalDate appointment_date, LocalTime appointment_time, String status) {
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.appointment_date = appointment_date;
        this.appointment_time = appointment_time;
        this.status = status;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public LocalDate getAppointment_date() {
        return appointment_date;
    }

    public LocalTime getAppointment_time() {
        return appointment_time;
    }

    public String getStatus() {
        return status;
    }
    
    
    
}
