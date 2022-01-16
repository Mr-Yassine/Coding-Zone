package com.example.codingzone.Models;


public class QuestionsModel {


    private String question_id;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String correct;


    public QuestionsModel(String question_id, String question, String answer1, String answer2, String answer3, String correct) {
        this.question_id = question_id;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correct = correct;
    }



    public String getQuestion_id() {return question_id;}
    public void setQuestion_id(String question_id) {this.question_id = question_id;}

    public String getQuestion() {return question;}
    public void setQuestion(String question) {this.question = question;}

    public String getAnswer1() {return answer1;}
    public void setAnswer1(String answer1) {this.answer1 = answer1;}

    public String getAnswer2() {return answer2;}
    public void setAnswer2(String answer2) {this.answer2 = answer2;}

    public String getAnswer3() {return answer3;}
    public void setAnswer3(String answer3) {this.answer3 = answer3;}

    public String getCorrect() {return correct;}
    public void setCorrect(String correct) {this.correct = correct;}
}
