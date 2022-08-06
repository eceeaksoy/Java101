package Alistirma;

import java.util.Scanner;

public class FibonacciSerisi {

    static int fib(int n)
    {
        if ((n == 1) || (n == 2))
        {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = keyboard.nextInt();
        System.out.println("Fibonacci: " + fib(n));
    }
}
