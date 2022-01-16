package com.example.codingzone.Models;

public class StudentModel {

    private int student_id;
    private String fname;
    private String email;
    private String code;



    public StudentModel() {}
    public StudentModel(int student_id, String fname, String email, String code) {
        this.student_id = student_id;
        this.fname = fname;
        this.email = email;
        this.code = code;
    }


    public int getStudent_id() {
        return student_id;
    }


    public String getFname() {return fname;}
    public void setFname(String fname) {this.fname = fname;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}
}
