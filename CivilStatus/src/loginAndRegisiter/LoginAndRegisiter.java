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
    
    private String name, email, password;

    public LoginAndRegisiter(String name, String email, String password) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
