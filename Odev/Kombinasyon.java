package Odev;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, r, kombinasyon;

        System.out.print("Ilk sayiyi giriniz: ");
        n = keyboard.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        r = keyboard.nextInt();

        int nFaktoriyel = 1, rFaktoriyel = 1, faktoriyel = 1;
        for (int i = 1; i <= n; i++)
        {
            nFaktoriyel *= i;
        }
        for (int j = 1; j <= r; j++)
        {
            rFaktoriyel *= j;
        }
        for (int x = 1; x <= n-r; x++)
        {
            faktoriyel *= x;
        }

        kombinasyon = nFaktoriyel / (rFaktoriyel * faktoriyel);
        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}
