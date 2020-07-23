package example;


public class GussNumberGame {
    private String answer;

    public GussNumberGame() {
        this.answer = "1234";
    }

    public String checkAnswer(String gussNumber) {
        if (gussNumber.equals(this.answer)) {
            return "4A0B";
        } else {
            return "";
        }
    }
}
