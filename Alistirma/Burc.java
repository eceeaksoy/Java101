package Alistirma;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int month, day;
        String burc = "";
        boolean hata = false;
        System.out.print("Dogdugunuz ay: ");
        month = keyboard.nextInt();

        System.out.print("Dogdugunuz gun: ");
        day = keyboard.nextInt();

        switch (month)
        {
            case 1:
                if ((day>=1) && (day<=31))
                {
                    if (day<22)
                    {
                        burc = "Oglak";
                    }
                    else {
                        burc = "Kova";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 2:
                if ((day>=1) && (day<=28))
                {
                    if (day<20)
                    {
                        burc = "Kova";
                    }
                    else {
                        burc = "Balik";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 3:
                if ((day>=1) && (day<=31))
                {
                    if (day<21)
                    {
                        burc = "Balik";
                    }
                    else {
                        burc = "Koc";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 4:
                if ((day>=1) && (day<=30))
                {
                    if (day<21)
                    {
                        burc = "Koc";
                    }
                    else {
                        burc = "Boga";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 5:
                if ((day>=1) && (day<=31))
                {
                    if (day<21)
                    {
                        burc = "Boga";
                    }
                    else {
                        burc = "Ikizler";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 6:
                if ((day>=1) && (day<=30))
                {
                    if (day<23)
                    {
                        burc = "Ikizler";
                    }
                    else {
                        burc = "Yengec";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 7:
                if ((day>=1) && (day<=31))
                {
                    if (day<23)
                    {
                        burc = "Yengec";
                    }
                    else {
                        burc = "Aslan";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 8:
                if ((day>=1) && (day<=31))
                {
                    if (day<23)
                    {
                        burc = "Aslan";
                    }
                    else {
                        burc = "Basak";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 9:
                if ((day>=1) && (day<=30))
                {
                    if (day<23)
                    {
                        burc = "Basak";
                    }
                    else {
                        burc = "Terazi";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 10:
                if ((day>=1) && (day<=31))
                {
                    if (day<23)
                    {
                        burc = "Terazi";
                    }
                    else {
                        burc = "Akrep";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 11:
                if ((day>=1) && (day<=30))
                {
                    if (day<22)
                    {
                        burc = "Akrep";
                    }
                    else {
                        burc = "Yay";
                    }
                }
                else {
                    hata = true;
                }
                break;
            case 12:
                if ((day>=1) && (day<=31))
                {
                    if (day<22)
                    {
                        burc = "Yay";
                    }
                    else {
                        burc = "Oglak";
                    }
                }
                else {
                    hata = true;
                }
                break;
            default:
                hata = true;
        }
        if (hata)
        {
            System.out.println("Hatali bir giris yaptiniz!");
        }
        else {
            System.out.println("Burcunuz " + burc);
        }
    }
}
