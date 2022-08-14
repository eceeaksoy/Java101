package Odev;

import java.util.Scanner;

public class PalindromikKelime {

    static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >=0; i--)
        {
            reverse += str.charAt(i);
        }
        return (reverse.equals(str));
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = keyboard.nextLine();

        if (isPalindrome(s))
        {
            System.out.println(s + " is a Palindrome Word!");
        }
        else {
            System.out.println(s + " is not a Palindrome Word!");
        }
    }
}
