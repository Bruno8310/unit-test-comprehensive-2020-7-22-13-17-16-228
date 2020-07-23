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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String checkAnswer(String guessNumber) {
        if (guessNumber.equals(this.answer)) {
            return "4A0B";
        } else {
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

    public String randNumber() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() < 4) {
            set.add(random.nextInt(10));
        }
        Iterator<Integer> iterator = set.iterator();
        String answer = "";
        while (iterator.hasNext()) {
            answer += iterator.next();
        }
        System.out.println(answer);
        return answer;
    }

    public String receiveUserInput() {
        Scanner scanner = new Scanner(System.in);
        String guessNumber = scanner.nextLine();
        char[] guessNumerToArray = guessNumber.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char element : guessNumerToArray) {
            set.add(element);
        }

        if (guessNumber.length() < 4 || set.size() == guessNumerToArray.length) {
            return "Wrong Input, Input again";
        } else {
            return guessNumber;
        }
    }
}
