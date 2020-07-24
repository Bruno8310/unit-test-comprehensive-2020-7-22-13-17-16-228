package example;


import java.util.*;

public class GussNumberGame {

    private String answer;

    public GussNumberGame() {
        this.answer = "1234";
    }

    public GussNumberGame(String answer) {
        this.answer = answer;
    }

    public String checkAnswer(String guessNumber) {

        char[] guessNumberArr = guessNumber.toCharArray();
        char[] answerArr = this.answer.toCharArray();

        int countSameNumber = 0;
        int countSamePositionNumber = 0;

        for (int i = 0; i < guessNumberArr.length; i++) {
            char guessNumberArrELement = guessNumberArr[i];
            for (int j = 0; j < answerArr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (guessNumberArrELement == answerArr[j]) {
                    countSameNumber++;
                }
            }
        }

        for (int m = 0, n = 0; m < guessNumberArr.length && n < answerArr.length; m++, n++) {
            if (guessNumberArr[m] == answerArr[n]) {
                countSamePositionNumber++;
            }
        }
        return String.format("%sA%sB", String.valueOf(countSamePositionNumber), String.valueOf(countSameNumber));
    }
}
