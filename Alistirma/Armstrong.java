package Alistirma;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, basPow = 1, basamak, basamakSayisi = 0, tot = 0;
        System.out.print("Sayi giriniz: ");
        a = keyboard.nextInt();
        int num = a;

        // basamak bulma islemi
        while (a != 0)
        {
            a /= 10;
            basamakSayisi++;
        }
        a = num;

        //basamaklarin ussel toplami
        while (a != 0)
        {
            basamak = a % 10;
            basPow = 1;
            for (int i = 1; i <= basamakSayisi; i++)
            {
                basPow *= basamak;
            }
            tot += basPow;
            a /= 10;
        }

        //armstrong olup olmadigi
        if (tot==num)
        {
            System.out.println(num + " bir armstrong sayisidir!");
        }
        else {
            System.out.println(num + " bir armstrong sayisi degildir!");
        }
    }
}
