package com.example.codingzone.DAO;

import com.example.codingzone.Config.Config;

import java.sql.Connection;

public abstract class DAO<T> {

    public Connection connect = Config.getConnection();


    public abstract void create(T obj);
    public abstract Object update(T obj);
    public abstract void delete(T obj);
    public abstract void find(int id);

}
