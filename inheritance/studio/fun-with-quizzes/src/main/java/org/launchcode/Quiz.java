package org.launchcode;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Quiz {
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        for(Question question: questions) {
            question.displayQuestion();
            question.displayOptions();

            String instruction = "Enter your answer";
            if (question instanceof TrueFalseQuestion) {
                instruction += " [write either true or false]: ";
            } else if (question instanceof MultipleChoiceQuestion) {
                instruction += " [write the option number - an integer]: ";
            } else if (question instanceof CheckBoxQuestion) {
                instruction += " [write the option number(s) separated by comma, like 1, 2, 3: ";
            }

            System.out.print(instruction);

            Object userAnswer;

            if (question instanceof TrueFalseQuestion) {
                userAnswer = scanner.nextBoolean();
            } else if (question instanceof MultipleChoiceQuestion) {
                userAnswer = scanner.nextInt();
            } else if (question instanceof CheckBoxQuestion) {
                String[] userChoices = scanner.nextLine().split(", ");
                List<String> selectedOptions = new ArrayList<>();
//                for (String choice : userChoices) {
//                    selectedOptions.add(question.options.get(Integer.parseInt(choice) - 1));
//                }
            }
        }
    }
}
