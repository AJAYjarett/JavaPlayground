package challenges.week_2.palindrom_checker;

import java.util.Arrays;

public class PalindromeChecker {

    /*
    This method intakes a string and returns a boolean for if it is a palindrome or not.
     */
    public boolean isPalindrome(String wordToCheck){
        char[] charsToCheck = splitWord(wordToCheck);
        for (int i = 0; i < charsToCheck.length; i++) {
            if (charsToCheck[i] != charsToCheck[charsToCheck.length-(i+1)]){
                return false;
            }

        }
        return true;
    }


    //This method splits a string into a char array and makes sure its all the same case to be checked
    public char[] splitWord(String wordToSplit){
        return wordToSplit.toLowerCase().toCharArray();
    }

    public PalindromeChecker() {

    }

    //This method is used to split a sentence to then check which words are palindromes and returns a boolean array
    public boolean[] sentenceChecker(String sentenceToCheck){
        String[] splitSentence = sentenceToCheck.split(" ");
        boolean[] whichWordsPali = new boolean[splitSentence.length];
        for (int i = 0; i < splitSentence.length; i++) {
            whichWordsPali[i] = isPalindrome(splitSentence[i]);
        }
        return whichWordsPali;
    }



}
