package Alistirma;

import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0)
        {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (reverseNumber == number)
        {
            System.out.println("Palindromic!");
            return true;
        }
        else {
            System.out.println("Not Palindromic!");
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
