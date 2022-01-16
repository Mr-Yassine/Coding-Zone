package com.example.codingzone.DAO;

import com.example.codingzone.DAOImpl.QuestionsDAO;
import com.example.codingzone.DAOImpl.StaffDAO;
import com.example.codingzone.Models.QuestionsModel;
import com.example.codingzone.Models.StaffModel;

public class DAOFactory {

    public static boolean login(String username, String password){
        return new StaffDAO().login(username,password);
    }

    public static void register(StaffModel s){
        new StaffDAO().add(s);
    }


    public static QuestionsModel addQuestion(QuestionsModel q){
        return new QuestionsDAO().add(q);
    }

    public static boolean isRegistered(StaffModel s) {
        return new StaffDAO().isRegistered(s);

    }
}
