package com.example.codingzone.DAOImpl;

import com.example.codingzone.Config.Config;
import com.example.codingzone.DAO.DAO;
import com.example.codingzone.Models.QuestionsModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuestionsDAO extends DAO<QuestionsModel> {

    @Override
    public Object add(QuestionsModel q) throws SQLException {

        String query = "INSERT INTO Questions (question, answer1, answer2, answer3, correct) VALUES (?,?,?,?,?)";

        //prepared statement to avoid sql injection
        try {
            PreparedStatement preparedStatement = Config.getConnection().prepareStatement(query);
            preparedStatement.setString(1, q.getQuestion());
            preparedStatement.setString(2, q.getAnswer1());
            preparedStatement.setString(3, q.getAnswer2());
            preparedStatement.setString(4, q.getAnswer3());
            preparedStatement.setString(5, q.getCorrect());
            preparedStatement.execute();
            return q;

        }catch (SQLException e){
            e.printStackTrace();
            e.getCause();
        }
        return null;
    }

    @Override
    public void find(int id) {

    }

    @Override
    public Object update(QuestionsModel obj) throws SQLException {

        String query = "UPDATE Questions SET question = ?, answer1 = ?, answer2 = ?, answer3 = ?, correct = ? WHERE id = ?";

        try {
            PreparedStatement preparedStatement = Config.getConnection().prepareStatement(query);
            preparedStatement.setString(1, obj.getQuestion());
            preparedStatement.setString(2, obj.getAnswer1());
            preparedStatement.setString(3, obj.getAnswer2());
            preparedStatement.setString(4, obj.getAnswer3());
            preparedStatement.setString(5, obj.getCorrect());
            preparedStatement.setInt(6, obj.getQuestion_id());
            preparedStatement.execute();
            return obj;

        } catch (SQLException e) {
            e.printStackTrace();
            e.getCause();
        }
        return null;
    }

    @Override
    public void delete(QuestionsModel obj) {}



    /*
    public QuestionsModel findAll(QuestionsModel q) throws SQLException {

        String query = "SELECT * FROM Questions";

        try {
            PreparedStatement preparedStatement = Config.getConnection().prepareStatement(query);
            //return getAllQuestions(preparedStatement.executeQuery());
            return q;
        } catch (SQLException e) {
            e.printStackTrace();
            e.getCause();
        }
        return null;
    }
     */
}
