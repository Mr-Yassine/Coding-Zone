package com.example.codingzone.DAOImpl;

import com.example.codingzone.Config.Config;
import com.example.codingzone.DAO.DAO;
import com.example.codingzone.Models.QuestionsModel;
import com.example.codingzone.Models.StaffModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentsDAO extends DAO<StaffModel> {


    @Override
    public Object add(StaffModel obj) {
        return null;
    }

    @Override
    public void find(int id) {}

    @Override
    public Object update(StaffModel obj) throws SQLException {return null;}

    @Override
    public void delete(StaffModel obj) {}







    public boolean login(String code) {

        String query = "SELECT count(1) FROM Students WHERE code ='" + code + "'";

        try {

            Statement statement = Config.getConnection().createStatement();
            ResultSet queryResult = statement.executeQuery(query);

            while (queryResult.next()){

                if (queryResult.getInt(1)== 1) {
                    System.out.println("Student Logged Successfully");
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return false;
    }
}
