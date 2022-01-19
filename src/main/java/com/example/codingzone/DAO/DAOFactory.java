package com.example.codingzone.DAO;

import com.example.codingzone.DAOImpl.QuestionsDAO;
import com.example.codingzone.DAOImpl.StaffDAO;
import com.example.codingzone.DAOImpl.StudentsDAO;
import com.example.codingzone.Models.QuestionsModel;
import com.example.codingzone.Models.StaffModel;

import java.sql.SQLException;

public class DAOFactory {


    public static boolean login(String username, String password) {
        return new StaffDAO().login(username, password);
    }

    public static boolean signin(String code) {
        return new StudentsDAO().login(code);
    }


    public static boolean register(StaffModel s) {
        new StaffDAO().add(s);
        return true;
    }

    public static boolean isRegistered(StaffModel s) {
        return new StaffDAO().isRegistered(s);
    }

    public static boolean getAllUsers() {
        return new StaffDAO().getAllUsers();
    }


    public static void addQuestion(QuestionsModel q) throws SQLException {
        new QuestionsDAO().add(q);
    }



    /*
    public static List<QuestionsModel> getAllQuestions() {
        return new QuestionsDAO().findAll();
    }
    */
}
