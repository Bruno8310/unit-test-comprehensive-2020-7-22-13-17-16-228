package example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GussNumberGameTest {

    @Test
    void should_return_4A0B_when_guess_is_1234_given_answer_is_1234() {

        // given
        String gussNumber = "1234";
        GussNumberGame gussNumberGame = new GussNumberGame();

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
        Assertions.assertEquals("1A3B",actual);

    }

    @Test
    void should_return_0A4B_when_guess_is_4321_given_answer_is_1234() {
        // give
        String gussNumber = "4321";
        GussNumberGame gussNumberGame = new GussNumberGame();
        // when
        String actual = gussNumberGame.checkAnswer(gussNumber);
        // then
        Assertions.assertEquals("0A4B",actual);

    }

    @Test
    void should_return_2A2B_when_guess_is_1243_given_answer_is_1234() {
        // give
        String gussNumber = "1243";
        GussNumberGame gussNumberGame = new GussNumberGame();
        // when
        String actual = gussNumberGame.checkAnswer(gussNumber);
        // then
        Assertions.assertEquals("2A2B",actual);

    }





}
