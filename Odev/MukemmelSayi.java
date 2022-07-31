package Odev;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n = keyboard.nextInt();
        int tot = 0;

        for (int i = 1; i < n; i++)
        {
            if (n%i==0)
            {
                tot += i;
            }
        }
        if (tot==n)
        {
            System.out.println(n + " Mukemmel sayidir.");
        }
        else {
            System.out.println(n + " Mukemmel sayi degildir.");
        }
    }
}
