package org.launchcode;

public abstract class Question {
    protected String questionText;
    protected Object answer;

    public Question(String questionText, Object answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public abstract void displayQuestion();
    public abstract void displayOptions();
    public abstract boolean checkAnswer(Object userAnswer);
}