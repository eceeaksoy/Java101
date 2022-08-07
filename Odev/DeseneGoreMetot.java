package Odev;

import java.util.Scanner;

public class DeseneGoreMetot {

    static int negative(int a)
    {
        if (a > 0)
        {
            System.out.print(a + " ");
        }
        else {
            return a;
        }
        return negative(a-5);
    }

    static int positive(int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        else {
            System.out.print(a + " ");
            return positive(a+5,b);
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("N sayisi: ");
        int n = keyboard.nextInt();
        System.out.print("Ciktisi: ");
        positive(negative(n),n);
    }
}
