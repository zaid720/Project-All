/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginAndRegisiter;

/**
 *
 * @author ITS
 */
public class LoginAndRegisiter {
    
    private String name, email;
    private int password;

    public LoginAndRegisiter(String name, String email, int password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public LoginAndRegisiter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
     
    
}
