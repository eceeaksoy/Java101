package Odev;

import java.util.Scanner;

public class RecursiveMetotIleAsalSayi {

    static void primeNumber(int x, int y)
    {
        if (x == y)
        {
            System.out.println("It is a prime number!");
            return;
        }
        else if (x % y == 0)
        {
            System.out.println("It is not a prime number!");
            return;
        }
        primeNumber(x, y+1);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = keyboard.nextInt();
        primeNumber(n,2);
    }
}
