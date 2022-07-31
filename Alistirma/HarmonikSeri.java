package Alistirma;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n = keyboard.nextInt();
        double tot = 0;

        for (int i = 1; i <= n; i++)
        {
            tot += 1.0/i;
        }

        System.out.println(n + " sayisinin harmonik serisi = " + tot);

    }
}
