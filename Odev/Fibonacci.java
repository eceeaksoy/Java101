package Odev;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Number of entry: ");
        int n = keyboard.nextInt();

        int n1 = 0, n2 = 1, tot = 0, sayac = 0;

        while (sayac != n)
        {
            tot = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + tot);
            n1 = n2;
            n2 = tot;
            sayac++;
        }
    }
}
