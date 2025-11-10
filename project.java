import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Who invented Java?",
            "Which keyword is used to inherit a class in Java?"
        };

        String[][] options = {
            {"A) Paris", "B) London", "C) Berlin", "D) Madrid"},
            {"A) James Gosling", "B) Dennis Ritchie", "C) Bjarne Stroustrup", "D) Guido van Rossum"},
            {"A) implements", "B) interface", "C) extends", "D) inherits"}
        };

        char[] answers = {'A', 'A', 'C'};
        int score = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }
            System.out.print("Your answer: ");
            char ans = sc.next().toUpperCase().charAt(0);
            if (ans == answers[i]) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect. Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your final score: " + score + " out of " + questions.length);
        sc.close();
    }
}
