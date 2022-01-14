package com.example.codingzone.DAOImpl;

import com.example.codingzone.Config.Config;
import com.example.codingzone.DAO.DAO;
import com.example.codingzone.Models.Staff;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StaffImpl extends DAO<Staff> {


    @Override
    public Staff find(long id) {
        return null;
    }

    @Override
    public Staff create(Staff obj) {
        return null;
    }

    @Override
    public Staff update(Staff obj) {
        return null;
    }

    @Override
    public void delete(Staff obj) {
    }




    public boolean login(String username, String password) {

        String query = "SELECT count(1) FROM Staff WHERE username ='" + username + "' AND password ='" + password + "'";

        try {

            Statement statement = Config.getConnection().createStatement();
            ResultSet queryResult = statement.executeQuery(query);

            while (queryResult.next()){
                System.out.println("here");
                //System.out.println(queryResult.getInt(1));

                if (queryResult.getInt(1)== 1) {
                    System.out.println("Login Successful");
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
