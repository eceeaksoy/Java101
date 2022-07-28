package Odev;

import java.util.Scanner;

public class UcVeDordeBolunebilmeVeOrt {
    public static void main(String[] args) {
        int num, tot = 0, sayac = 0;
        double ort;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        num = keyboard.nextInt();

        for (int i = 0; i <= num; i++)
        {
            if ((i%3==0) && (i%4==0))
            {
                tot += i;
                sayac++;
            }
        }
        ort = tot/(sayac-1);
        System.out.print("0'dan " + num + " sayisina kadar 3 ve 4'e tam bolunen ");
        System.out.println("sayilarin ortalamasi " + ort);
    }
}
