/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personal;

import java.time.LocalDateTime;

/**
 *
 * @author ITS
 */
public class Personal {
    
    private int id;
    private LocalDateTime created_at;

    public Personal(int id, LocalDateTime created_at) {
        this.id = id;
        this.created_at = created_at;
    }

    public Personal() {
    }
    
    public int getId() {
        return id;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }
    
}
