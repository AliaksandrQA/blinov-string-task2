package by.itacademy.alexverteyko;

import java.util.Locale;
import java.util.Scanner;

public class AlphabetRunner {
    public static void main(String[] args) {
        String alphabet = ("abcdefghijklmnopqrstuvwxyz");

        //Enter your word here
        String str1 = getString();

        //Parse the string to array of chars
        char[] charArray = str1.toLowerCase(Locale.ROOT).toCharArray();

        //Show entered letters
        printEnteredLetters(str1, charArray);

        //Show the alphabet number of entered letters
        printAlphabetNumberOrder(alphabet, charArray);
    }


    public static String getString() {
        String str1 = "";
        System.out.println("Enter the word:");
        Scanner sc1 = new Scanner(System.in);
        str1 = sc1.nextLine();
        return str1;
    }

    private static void printEnteredLetters(String str1, char[] charArray) {
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(charArray[i] + "  ");
        }
        System.out.println("");
    }

    private static void printAlphabetNumberOrder(String alphabet, char[] charArray) {
        for (char x : charArray) {
            //Ignore space sign
            if (x == ' ') {
                System.out.print("");
            } else {
                int i = alphabet.lastIndexOf(x);
                i += 1;
                System.out.print(i + "  ");
            }
        }
    }
}
