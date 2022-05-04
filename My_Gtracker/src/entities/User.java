/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author yassi
 */
public class User {
private int id;
    private String username;
    private String cin;
    private String password;

    
     public User(int id, String username, String cin, String password ) {
         this.id = id;
         this.username = username;
         this.cin = cin;
         this.password = password;
    }
     
      public User(String username, String cin, String password ) {
         this.username = username;
         this.cin = cin;
         this.password = password;
    }
     
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
     public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
     public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   
     @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", cin=" + cin + ", password=" + password + '}';
    }
}
