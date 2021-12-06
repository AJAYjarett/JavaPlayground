package challenges.week_2.palindrom_checker;

import java.util.Arrays;

public class PalindromeChecker {

    public boolean isPalindrome(String wordToCheck){
        char[] charsToCheck = splitWord(wordToCheck);
        for (int i = 0; i < charsToCheck.length; i++) {
            if (charsToCheck[i] != charsToCheck[charsToCheck.length-(i+1)]){
                return false;
            }

        }
        return true;
    }


    public char[] splitWord(String wordToSplit){
        return wordToSplit.toLowerCase().toCharArray();
    }

    public String[] splitSentence(String sentenceToSplit){
        return sentenceToSplit.split(" ");
    }

    public PalindromeChecker() {

    }

    public boolean[] sentenceChecker(String sentenceToCheck){
        String[] splitSentence = sentenceToCheck.split(" ");
        boolean[] whichWordsPali = new boolean[splitSentence.length];
        for (int i = 0; i < splitSentence.length; i++) {
            whichWordsPali[i] = isPalindrome(splitSentence[i]);
        }
        return whichWordsPali;
    }



}
