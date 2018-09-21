package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Global
        Scanner kbInput = new Scanner(System.in);
        boolean anagram = true;


        while(anagram) {

            //Where the user inputs two strings
            System.out.println("Enter a word");
            String fWord = kbInput.nextLine(); //first word
            System.out.println("Enter another word");
            String sWord = kbInput.nextLine(); //second word

            //converting inputs to characters and sorting
            char[] fWordArray = fWord.toCharArray();
            char[] sWordArray = sWord.toCharArray();
            Arrays.sort(fWordArray);
            Arrays.sort(sWordArray);

            //Where lengths are stored
            int fString = fWord.length();
            int sString = sWord.length();

            //Where it test to see if they're equal lengths
            if (fString != sString) {
                System.out.println("These words aren't anagrams");
                System.out.println("Try again");
            }
            //If fWord and sWord are anagrams
            else if(fString == sString){
                if(Arrays.equals(fWordArray,sWordArray)){
                    System.out.println(fWord + " and " + sWord + " are anagrams");
                    anagram = false;
                }else {
                    System.out.println(fWord + " and " + sWord + " aren't anagrams");
                }
            }


        }
    }
}
