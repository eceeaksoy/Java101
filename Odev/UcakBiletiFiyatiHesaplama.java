package Odev;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int mesafe, yas, yolculukTipi;
        double tutar, totTutar = 0, indirim, yeniTutar;
        boolean hata = false;

        System.out.print("Mesafeyi km turunden giriniz: ");
        mesafe = keyboard.nextInt();
        System.out.print("Yasinizi giriniz: ");
        yas = keyboard.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon, 2 => Gidis Donus): ");
        yolculukTipi = keyboard.nextInt();

        if ((mesafe>0) && (yas>0))
        {
            tutar = mesafe * 0.10;
            if (yas<12)
            {
                indirim = 0.5;
                yeniTutar = tutar - (tutar*indirim);
            }
            else if ((yas>=12) && (yas<=24))
            {
                indirim = 0.1;
                yeniTutar = tutar - (tutar*indirim);
            }
            else if (yas>65)
            {
                indirim = 0.3;
                yeniTutar = tutar - (tutar*indirim);
            }
            else {
                yeniTutar = tutar;
            }
            if (yolculukTipi == 2)
            {
                indirim = 0.2;
                totTutar = (yeniTutar - (yeniTutar*indirim))*2;
            }
            else if (yolculukTipi == 1)
            {
                totTutar = yeniTutar;
            }
            else {
                hata = true;
            }
        }
        else {
            hata = true;
        }

        if (hata)
        {
            System.out.println("\nHatali Veri Girdiniz!");
        }
        else {
            System.out.println("\nToplam Tutar = " + totTutar + " TL");
        }
    }
}
