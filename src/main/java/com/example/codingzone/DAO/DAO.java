package com.example.codingzone.DAO;

import com.example.codingzone.Config.Config;
import com.example.codingzone.Models.QuestionsModel;
import com.example.codingzone.Models.StaffModel;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class DAO<T> {

    public Connection connect = Config.getConnection();



    public abstract Object add(T obj) throws SQLException;
    public abstract void find(int id);
    public abstract Object update(T obj) throws SQLException;
    public abstract void delete(T obj);
}
