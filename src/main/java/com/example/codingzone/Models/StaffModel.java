package com.example.codingzone.Models;

public class StaffModel {

    private String staff_id;
    private String username;
    private String email;
    private String password;


    public StaffModel() {}
    public StaffModel(String staff_id, String username, String email, String password) {
        this.staff_id = staff_id;
        this.username = username;
        this.email = email;
        this.password = password;
    }




    public String getId() {return staff_id;}

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
}
