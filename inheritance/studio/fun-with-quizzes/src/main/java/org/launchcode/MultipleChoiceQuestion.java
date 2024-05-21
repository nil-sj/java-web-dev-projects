package org.launchcode;
import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> options;

    public MultipleChoiceQuestion(String questionText, List<String> options, Object answer) {
        super(questionText, answer);
        this.options = options;
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
    }

    @Override
    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println("Option " + (i+1) + ": " + options.get(i));
        }
    }

    @Override
    public boolean checkAnswer(Object userAnswer) {
        // build the logic and then return either true or false
        return true;
    }


}
