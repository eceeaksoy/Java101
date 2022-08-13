package Alistirma;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int)Math.random() * 100;

        Scanner keyboard = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5)
        {
            System.out.print("Enter your guess: ");
            selected = keyboard.nextInt();
            if (selected < 0 || selected > 99)
            {
                System.out.println("Please enter a number between 0 and 100");
                if (!isWrong)
                {
                    isWrong = true;
                    System.out.println("If you log in incorrectly again, you will lose one of your rights!");
                }
                else {
                    System.out.print("You made too many incorrect entries. ");
                    System.out.println("Remaining right: " + (5 - ++right));
                    continue;
                }
                continue;
            }

            if (selected == number)
            {
                System.out.println("Congratulations! Your guess is correct!");
                isWin = true;
                break;
            }
            else {
                System.out.println("Your guess is wrong!");
                if (selected > number)
                {
                    System.out.println(selected + " is greater than the hidden number.");
                }
                else {
                    System.out.println(selected + " is less than the hidden number.");
                }
                wrong[right] = selected;
                System.out.println("Remaining right: " + (5 - ++right));
            }
        }
        if (!isWin)
        {
            System.out.println("You lost! The number is " + number);
            if (!isWrong)
            {
                System.out.println("Your guess: " + Arrays.toString(wrong));
            }
        }

        System.out.println(number);
    }
}
