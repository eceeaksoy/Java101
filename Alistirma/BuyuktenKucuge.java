package Alistirma;

import java.util.Scanner;

public class BuyuktenKucuge {
    public static void main(String[] args) {
        int a, b, c;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("1. sayi: ");
        a = keyboard.nextInt();
        System.out.print("2. sayi: ");
        b = keyboard.nextInt();
        System.out.print("3. sayi: ");
        c = keyboard.nextInt();

        if ((a>b) && (a>c))
        {
            if (b>c)
            {
                System.out.println(a + " > " + b + " > " + c);
            }
            else {
                System.out.println(a + " > " + c + " > " + b);
            }
        }
        else if ((a<b) && (b>c))
        {
            if (a>c)
            {
                System.out.println(b + " > " + a + " > " + c);
            }
            else {
                System.out.println(b + " > " + c + " > " + a);
            }
        }
        else if ((c>b) && (c>a))
        {
            if (b>a)
            {
                System.out.println(c + " > " + b + " > " + a);
            }
            else {
                System.out.println(c + " > " + a + " > " + b);
            }
        }
    }
}
