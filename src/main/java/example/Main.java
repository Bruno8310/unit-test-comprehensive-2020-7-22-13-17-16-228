package example;

public class Main {
    public static void main(String[] args) {

        GetRandomAnswer getRandomAnswer = new GetRandomAnswer();

        GussNumberGame gussNumberGame = new GussNumberGame(getRandomAnswer.randNumber());

        UserInputContent userInputContent = new UserInputContent();

        for (int i = 0; i < 6; i++) {
            String isValidGuessNumber = userInputContent.receiveUserInput();
            String validGuessNumber = userInputContent.isValid(isValidGuessNumber);
            String result = gussNumberGame.checkAnswer(validGuessNumber);

        }
    }
}
