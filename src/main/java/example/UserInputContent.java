package example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserInputContent {

    public String receiveUserInput() {
        Scanner scanner = new Scanner(System.in);
        String guessNumber = scanner.nextLine();
        return guessNumber;
    }

    public String isValid(String guessNumber) {
        char[] guessNumerToArray = guessNumber.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char element : guessNumerToArray) {
            set.add(element);
        }
        if (guessNumber.length() < 4 || set.size() == guessNumerToArray.length) {
            return "Wrong Input, Input again";
        }
        return guessNumber;
    }
}
