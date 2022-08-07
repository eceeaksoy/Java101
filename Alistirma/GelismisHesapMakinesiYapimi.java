package Alistirma;

import java.util.Scanner;

public class GelismisHesapMakinesiYapimi {

    static int sum(int a, int b)
    {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    static int minus(int a, int b)
    {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }

    static int times(int a, int b)
    {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }

    static int divided(int a, int b)
    {
        if (b == 0)
        {
            System.out.println("Second number must be different from zero!");
            return 0;
        }
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }

    static int power(int a, int b)
    {
        int result = 1;
        for (int i = 1; i <= b; i++)
        {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b)
    {
        return a % b;
    }

    static void rect(int a, int b)
    {
        System.out.println("Perimeter: " + (2*(a + b)));
        System.out.println("Area: " + a*b);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int select;

        String menu = "1) Summation\n2) Subtraction\n"
                + "3) Multiplication\n4) Division\n"
                + "5) Exponential Numbers\n6) Modulus\n"
                + "7) Rectangular Area and Perimeter\n"
                + "0) Log Out";
        while (true)
        {
            System.out.println(menu);
            System.out.print("Select an operation: ");
            select = keyboard.nextInt();
            if (select == 0)
            {
                break;
            }
            System.out.print("Enter a number: ");
            int a = keyboard.nextInt();
            System.out.print("Enter another number: ");
            int b = keyboard.nextInt();
            int result = 0;
            switch (select)
            {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println(a + "^" + b + " = " + power(a,b));
                    break;
                case 6:
                    System.out.println("mod(" + a + "," + b + ") = " + mod(a,b));
                    break;
                case 7:
                    rect(a,b);
                    break;
                default:
                    System.out.println("You entered an invalid operation!");
            }
        }
        System.out.println("Good Bye!");
    }
}
