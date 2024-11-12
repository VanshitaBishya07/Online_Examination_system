import java.util.List;
import java.util.Scanner;

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();
        QuestionBank questionBank = new QuestionBank();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = authService.authenticate(username, password);
        if (user == null) {
            System.out.println("Invalid username or password.");
            return;
        }

        if (user.getRole().equals("student")) {
            System.out.println("Welcome, " + user.getUsername() + "! Starting your exam.");
            List<Question> questions = questionBank.getRandomQuestions(5); // 5 questions for this example
            Exam exam = new Exam(questions, 60); // 60 seconds for the exam duration
            exam.start();
        } else if (user.getRole().equals("admin")) {
            System.out.println("Welcome, Admin!");
            // Admin functionalities can be added here, like adding new questions
        }

        scanner.close();
    }
}

