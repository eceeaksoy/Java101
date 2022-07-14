package Alistirma;

import java.util.Scanner;

public class KDVTutari {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Fiyati giriniz: ");
        tutar = keyboard.nextDouble();
        double kdv = tutar * kdvOran;
        double kdvliTutar = tutar + kdv;
        System.out.println("KDV'li fiyat: " + kdvliTutar);
        System.out.println("KDV tutari: " + kdv);
    }
}
