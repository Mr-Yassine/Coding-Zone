package com.example.codingzone.DAO;

import com.example.codingzone.Config.Config;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAO<T> {

    public Connection connect = Config.getConnection();



    public abstract Object add(T obj);
    public abstract void find(int id);
    public abstract Object update(T obj) throws SQLException;
    public abstract boolean findAll();
    public abstract void delete(T obj);
}
