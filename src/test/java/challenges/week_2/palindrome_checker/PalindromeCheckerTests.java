package challenges.week_2.palindrome_checker;

import challenges.week_2.palindrom_checker.PalindromeChecker;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static  org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;

public class PalindromeCheckerTests {
    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void palindromeCheckerTests(){

        assertEquals(palindromeChecker.isPalindrome("makam"), true);
        assertEquals(palindromeChecker.isPalindrome("Racecar"), true);
        assertEquals(palindromeChecker.isPalindrome("maddam"), true);
        assertEquals(palindromeChecker.isPalindrome("Alexander"), false);
    }

    @Test
    public void sentencePalindromeCheckerTests(){
        boolean[] testSentence = {true,false,true,false,true};
        Assertions.assertArrayEquals(palindromeChecker.sentenceChecker("Makam drives a fast Racecar"), testSentence);
    }
}
