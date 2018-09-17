package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Where the scanner is created
        Scanner kbInput = new Scanner(System.in);
        boolean anagram = true;

        //Where the user inputs two strings
        while(anagram) {

            System.out.println("Enter a word that's 5 characters or less");
            String fWord = kbInput.nextLine(); //first word
            System.out.println("Enter another word that's 5 characters or less");
            String sWord = kbInput.nextLine(); //second word

            //Where lengths are stored
            int fString = fWord.length();
            int sString = sWord.length();

            //Where it test to see if they're equal lengths
            if (fString != sString) {
                System.out.println("These words aren't anagrams");
                System.out.println("Try again");
            }
            //If fWord and sWord are 5 words or less
            else if (fString == sString){
                System.out.println("test");
                anagram = false;

            }


        }
    }
}
