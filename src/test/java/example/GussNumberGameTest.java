package example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GussNumberGameTest {

    @Test
    void should_return_4A0B_when_guess_is_1234_given_answer_is_1234() {

        // given
        GussNumberGame gussNumberGame = new GussNumberGame();
        String gussNumber = "1234";

        // when
        String actual = gussNumberGame.checkAnswer(gussNumber);

        // then
        Assertions.assertEquals("4A0B", actual);
    }

    @Test
    void should_return_1A3B_when_guess_is_1342_given_answer_is_1234() {
        // give
        String gussNumber = "1342";
        GussNumberGame gussNumberGame = new GussNumberGame();
        // when
        String actual = gussNumberGame.checkAnswer(gussNumber);
        // then
        Assertions.assertEquals("1A3B", actual);

    }

    @Test
    void should_return_0A4B_when_guess_is_4321_given_answer_is_1234() {
        // give
        String gussNumber = "4321";
        GussNumberGame gussNumberGame = new GussNumberGame();
        // when
        String actual = gussNumberGame.checkAnswer(gussNumber);
        // then
        Assertions.assertEquals("0A4B", actual);

    }

    @Test
    void should_return_2A2B_when_guess_is_1243_given_answer_is_1234() {
        // give
        String gussNumber = "1243";
        GussNumberGame gussNumberGame = new GussNumberGame();
        // when
        String actual = gussNumberGame.checkAnswer(gussNumber);
        // then
        Assertions.assertEquals("2A2B", actual);

    }

    @Test
    void should_return_0A2B_when_guess_is_5621_given_answer_is_1234() {
        // give
        String gussNumber = "5621";
        GussNumberGame gussNumberGame = new GussNumberGame();
        // when
        String actual = gussNumberGame.checkAnswer(gussNumber);
        // then
        Assertions.assertEquals("0A2B", actual);

    }

    @Test
    void should_return_0A0B_when_guess_is_5678_given_answer_is_1234() {
        // give
        String gussNumber = "5678";
        GussNumberGame gussNumberGame = new GussNumberGame();
        // when
        String actual = gussNumberGame.checkAnswer(gussNumber);
        // then
        Assertions.assertEquals("0A0B", actual);

    }

    @Test
    void should_return_rightAnswer_when_guess_use_six_chances_given_answer_is_randNumber() {
        // give
        GussNumberGame gussNumberGame = new GussNumberGame();
        gussNumberGame.setAnswer(gussNumberGame.randNumber());
        String guessNumber = "";

        // when
        String actual = gussNumberGame.checkAnswer(guessNumber);
        // then
        Assertions.assertEquals(gussNumberGame.getAnswer(), actual);

    }


}
