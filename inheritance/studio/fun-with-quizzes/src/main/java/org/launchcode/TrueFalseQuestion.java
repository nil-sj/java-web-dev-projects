package org.launchcode;

public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String questionText, boolean answer) {
        super(questionText, answer);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
    }

    @Override
    public void displayOptions() {
        System.out.println("Option 1: True");
        System.out.println("Option 2: False");
    }

    @Override
    public boolean checkAnswer(Object userAnswer) {
        // logic to check the answer
        return true;
    }
}
