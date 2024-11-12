import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Exam {
    private List<Question> questions;
    private int score;
    private int duration; // in seconds

    public Exam(List<Question> questions, int duration) {
        this.questions = questions;
        this.duration = duration;
        this.score = 0;
    }

    public void start() {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up! Submitting your exam.");
                calculateResult();
                System.exit(0);
            }
        }, duration * 1000);

        for (Question question : questions) {
            System.out.println("\n" + question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();
            if (answer == question.getCorrectAnswer()) {
                score += question.getPoints();
            }
        }

        timer.cancel();
        calculateResult();
    }

    private void calculateResult() {
        System.out.println("\nExam completed.");
        System.out.println("Your Score: " + score);
    }
}

