package seminars.second.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OptionalQuizzesTest {
    OptionalQuizzes quiz;
    @BeforeEach
    void setUp(){
        quiz = new OptionalQuizzes();
    }
    @Test
    @DisplayName("Check the integer to Palindrome true")
    void palindromeCheckerTest() {
        int value = 121;
        assertTrue(quiz.palindromeChecker(value));
    }

    @Test
    @DisplayName(value = "Check the integer to Palindrome false")
    void palindromeCheckerNegativeTest(){
        int value = 123;
        assertFalse(quiz.palindromeChecker(123));
    }
    @Test
    @DisplayName("Inappropriate value exception for checking to palindrome")
    void palindromeCheckerIllegalVariableException(){
        assertThrows(IllegalArgumentException.class, () -> quiz.palindromeChecker(-123));
    }

    @Test
    @DisplayName("Check the prime multipliers")
    void getPrimeMultipliersNaturalTest(){
        int critValue = 12;
        List<Integer> testArray = new ArrayList<>(Arrays.asList(1,2,2,3));
        Assertions.assertIterableEquals(testArray, quiz.getPrimeMultipliersNatural(critValue));
    }


}