package com.example.codingzone.DAO;

import com.example.codingzone.Config.Config;

import java.sql.Connection;

public abstract class DAO <T> {

    public Connection connect = Config.getConnection();

    public abstract T find(long id);
    public abstract T create(T obj);
    public abstract T update(T obj);
    public abstract void delete(T obj);
}