package Odev;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dogumYili, kalan;
        String zodyak = "";

        System.out.print("Dogum Yilinizi Giriniz: ");
        dogumYili = keyboard.nextInt();

        kalan = dogumYili % 12;

        switch (kalan)
        {
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Kopek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Okuz";
                break;
            case 6:
                zodyak = "Kaplan";
                break;
            case 7:
                zodyak = "Tavsan";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yilan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;
            default:
                zodyak = "Maymun";
        }

        System.out.println("Cin Zodyagi Burcunuz: " + zodyak);
    }
}
