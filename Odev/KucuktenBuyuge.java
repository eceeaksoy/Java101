package Odev;

import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x, y, z;
        System.out.print("First number: ");
        x = keyboard.nextInt();
        System.out.print("Second number: ");
        y = keyboard.nextInt();
        System.out.print("Third number: ");
        z = keyboard.nextInt();

        if ((x<y) && (x<z))
        {
            if (y<z)
            {
                System.out.println(x + " < " + y + " < " + z);
            }
            else {
                System.out.println(x + " < " + z + " < " + y);
            }
        }
        else if ((y<x) && (y<z))
        {
            if (x<z)
            {
                System.out.println(y + " < " + x + " < " + z);
            }
            else {
                System.out.println(y + " < " + z + " < " + x);
            }
        }
        else {
            if (y<x)
            {
                System.out.println(z + " < " + y + " < " + x);
            }
            else {
                System.out.println(z + " < " + x + " < " + y);
            }
        }
    }
}
