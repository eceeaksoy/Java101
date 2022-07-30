package Alistirma;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int n, faktoriyel = 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        n = keyboard.nextInt();

        for (int i = 1; i <= n; i++)
        {
            faktoriyel *= i;
        }

        System.out.println(n + "! = " + faktoriyel);
    }
}
