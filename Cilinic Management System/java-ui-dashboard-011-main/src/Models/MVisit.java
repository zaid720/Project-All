/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import personal.Personal;

/**
 *
 * @author ITS
 */
public class MVisit extends Personal {
    private int appointment_id, docor_id;
    private LocalDate visit_date;
    private String diagnosis, notes;

    public MVisit(int id, int appointment_id, int docor_id, LocalDate visit_date, String diagnosis, String notes, LocalDateTime created_at) {
        super(id, created_at);
        this.appointment_id = appointment_id;
        this.docor_id = docor_id;
        this.visit_date = visit_date;
        this.diagnosis = diagnosis;
        this.notes = notes;
    }

    public MVisit(int appointment_id, int docor_id, LocalDate visit_date, String diagnosis, String notes) {
        this.appointment_id = appointment_id;
        this.docor_id = docor_id;
        this.visit_date = visit_date;
        this.diagnosis = diagnosis;
        this.notes = notes;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public int getDocor_id() {
        return docor_id;
    }

    public LocalDate getVisit_date() {
        return visit_date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getNotes() {
        return notes;
    }
    
}
