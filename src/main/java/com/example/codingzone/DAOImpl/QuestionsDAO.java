package com.example.codingzone.DAOImpl;

import com.example.codingzone.DAO.DAO;
import com.example.codingzone.Models.QuestionsModel;
import com.example.codingzone.Models.StaffModel;

public class QuestionsDAO extends DAO<QuestionsModel> {


    @Override
    public QuestionsModel add(QuestionsModel obj) {
        return null;
    }

    @Override
    public void find(int id) {

    }

    @Override
    public Object update(QuestionsModel obj) {
        return null;
    }

    @Override
    public void delete(StaffModel obj) {

    }

    @Override
    public void findAll() {

    }
/*
    public Questions getQuestions(int id) {
        Questions q = new Questions();
        q.setId(1);
        q.setQuestion("What is the output of the following code?");
        q.setOption1("A. Hello World");
        q.setOption2("B. Hello");
        q.setOption3("C. Hello World");
        q.setOption4("D. Hello");
        q.setAnswer("C");
        return q;
    }*/


}
