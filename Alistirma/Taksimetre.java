package Alistirma;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, total, baslangic = 10;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = keyboard.nextInt();
        total = baslangic + (km * perKM);
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar: " + total);


    }
}
