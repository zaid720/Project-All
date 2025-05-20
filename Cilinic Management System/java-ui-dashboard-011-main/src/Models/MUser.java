/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDateTime;
import personal.Personal;

/**
 *
 * @author ITS
 */
public class MUser extends Personal {

    private String username, password, role, full_name, phone;

    public MUser(String username, String password, String role, String full_name, String phone) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.full_name = full_name;
        this.phone = phone;
    }

    public MUser(int id, String username, String password, String role, String full_name, String phone, LocalDateTime created_at) {
        super(id, created_at);
        this.username = username;
        this.password = password;
        this.role = role;
        this.full_name = full_name;
        this.phone = phone;
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

}
