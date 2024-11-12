public class Question {
    private String questionText;
    private String[] options;
    private int correctAnswer;
    private int points;

    public Question(String questionText, String[] options, int correctAnswer, int points) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public int getPoints() {
        return points;
    }
}

