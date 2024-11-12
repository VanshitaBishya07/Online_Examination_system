import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Question> questions = new ArrayList<>();

    public QuestionBank() {
        // Sample questions
        questions.add(new Question("Capital of France?", new String[]{"Paris", "Berlin", "Rome", "Madrid"}, 1, 10));
        questions.add(new Question("5 + 7?", new String[]{"10", "11", "12", "13"}, 3, 5));
        questions.add(new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 2, 10));
        questions.add(new Question("Who wrote 'To Kill a Mockingbird'?", new String[]{"Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald"}, 1, 15));
        questions.add(new Question("Which element has the chemical symbol 'O'?", new String[]{"Oxygen", "Gold", "Iron", "Nitrogen"}, 1, 10));
        questions.add(new Question("What is the largest ocean on Earth?", new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"}, 4, 10));
        questions.add(new Question("Who painted the Mona Lisa?", new String[]{"Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Claude Monet"}, 1, 15));
        questions.add(new Question("In which year did the Titanic sink?", new String[]{"1912", "1910", "1920", "1905"}, 1, 10));
        questions.add(new Question("What is the boiling point of water in Celsius?", new String[]{"90°C", "100°C", "80°C", "120°C"}, 2, 5));
        questions.add(new Question("What is the chemical formula for water?", new String[]{"H2O", "CO2", "O2", "NaCl"}, 1, 5));
        questions.add(new Question("Who discovered penicillin?", new String[]{"Marie Curie", "Alexander Fleming", "Louis Pasteur", "Gregor Mendel"}, 2, 15));
        questions.add(new Question("Which country has the largest population?", new String[]{"India", "China", "USA", "Indonesia"}, 2, 10));
        questions.add(new Question("How many continents are there?", new String[]{"5", "6", "7", "8"}, 3, 5));
        questions.add(new Question("The Great Wall of China is located in which country?", new String[]{"India", "China", "Japan", "Mongolia"}, 2, 10));
        questions.add(new Question("Who is known as the Father of Computers?", new String[]{"Alan Turing", "Charles Babbage", "John von Neumann", "Isaac Newton"}, 2, 15));
    }

    public List<Question> getRandomQuestions(int count) {
        Collections.shuffle(questions); // Randomize questions
        return questions.subList(0, Math.min(count, questions.size()));
    }
}
