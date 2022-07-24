package Odev;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        boolean artikYil = false;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Yil Giriniz: ");
        year = keyboard.nextInt();

        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                {
                    artikYil = true;
                }
                else
                {
                    artikYil = false;
                }
            }
            else {
                artikYil = true;
            }
        }
        else {
            artikYil = false;
        }

        if (artikYil)
        {
            System.out.println(year + " bir artik yildir!");
        }
        else {
            System.out.println(year + " bir artik yil degildir!");
        }
    }
}
