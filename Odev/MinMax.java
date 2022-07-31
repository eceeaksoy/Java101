package Odev;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many numbers do you enter? ");
        int n = keyboard.nextInt();
        int min = 0, max = 0, num;

        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + ") ");
            num = keyboard.nextInt();
            if (i==1)
            {
                max = num;
                min = num;
            }
            else {
                if (num < min)
                {
                    min = num;
                }
                else if (num > max)
                {
                    max = num;
                }
            }
        }

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}
