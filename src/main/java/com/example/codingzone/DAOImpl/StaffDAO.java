package com.example.codingzone.DAOImpl;

import com.example.codingzone.Config.Config;
import com.example.codingzone.DAO.DAO;
import com.example.codingzone.Models.StaffModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StaffDAO extends DAO<StaffModel> {


    @Override
    public void find(int id) {}


    public Object add(StaffModel s){

        String query = "INSERT INTO Staff (username, email, password) VALUES (?,?,?)";

        //prepared statement to avoid sql injection
        try {
            PreparedStatement preparedStatement = Config.getConnection().prepareStatement(query);
            preparedStatement.setString(1, s.getUsername());
            preparedStatement.setString(2, s.getEmail());
            preparedStatement.setString(3, s.getPassword());
            preparedStatement.execute();
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            e.getCause();
        }
        return false;

    }



    @Override
    public Object update(StaffModel obj) {return null;}



    @Override
    public boolean findAll() {
        return false;
    }

    @Override
    public void delete(StaffModel obj) {

    }


    public boolean login(String username, String password) {

        String query = "SELECT count(1) FROM Staff WHERE username ='" + username + "' AND password ='" + password + "'";

        try {

            Statement statement = Config.getConnection().createStatement();
            ResultSet queryResult = statement.executeQuery(query);

            while (queryResult.next()){

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





    public boolean isRegistered(StaffModel s) {

        String query = "SELECT count(1) FROM Staff WHERE username ='" + s.getUsername() + "'";

        try {

            Statement statement = Config.getConnection().createStatement();
            ResultSet queryResult = statement.executeQuery(query);

            while (queryResult.next()){

                if (queryResult.getInt(1)== 1) {
                    System.out.println("Username already registered");
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return false;
    }






    public boolean getAllUsers() {

        String query = "SELECT * FROM Staff";

        try {
            Statement statement = Config.getConnection().createStatement();
            ResultSet queryResult = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return false;
    }


}
