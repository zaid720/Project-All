/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDateTime;

/**
 *
 * @author ITS
 */
public class ModelUser {
    
    private int id;
    private String username, password, role, full_name, phone;
    private LocalDateTime created_at;

    public ModelUser(String username, String password, String role, String full_name, String phone) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.full_name = full_name;
        this.phone = phone;
    }

    public ModelUser(int id, String username, String password, String role, String full_name, String phone, LocalDateTime created_at) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.full_name = full_name;
        this.phone = phone;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }
    
    
    
}
