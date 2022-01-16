package com.example.codingzone.DAO;

import com.example.codingzone.Config.Config;
import com.example.codingzone.Models.StaffModel;

import java.sql.Connection;

public abstract class DAO<T> {

    public Connection connect = Config.getConnection();



    public abstract T add(T obj);
    public abstract void find(int id);
    public abstract Object update(T obj);
    public abstract void delete(StaffModel obj);
    public abstract void findAll();

}
