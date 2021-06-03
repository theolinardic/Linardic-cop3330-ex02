package oop.ex02;
import java.util.Scanner;

public class ex02 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What is the input string? ");

        String userWord = userInputScanner.nextLine();
        int userWordLength = userWord.length();

        System.out.print(userWord + " has " + userWordLength + " characters.");
    }
}
