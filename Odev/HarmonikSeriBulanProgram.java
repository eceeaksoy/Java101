package Odev;

import java.util.Scanner;

public class HarmonikSeriBulanProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        double tot = 0, i = 1;
        System.out.print("Sayi giriniz: ");
        n = keyboard.nextInt();

        while (i <= n)
        {
            tot += 1/i;
            i++;
        }

        System.out.println(n + " sayisinin harmonik serisi = " + tot);
    }
}
