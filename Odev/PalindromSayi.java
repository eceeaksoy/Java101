package Odev;

import java.util.Scanner;

public class PalindromSayi {

    static boolean isPalindrom(int number)
    {
        int temp = number, reverseNum = 0, lastNum;
        while (temp != 0)
        {
            lastNum = temp % 10;
            reverseNum *= 10;
            reverseNum += lastNum;
            temp /= 10;
        }

        System.out.println("Is it Palindromic?");

        if (number == reverseNum)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();
        System.out.println(isPalindrom(num));
    }
}
