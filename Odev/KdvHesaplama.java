package Odev;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double fiyat;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("KDV'siz fiyat = ");
        fiyat = keyboard.nextDouble();
        boolean kosul1 = (fiyat<1000)&&(fiyat>0);
        double kdvOran = kosul1 ? 0.18 : 0.08;
        double kdv = fiyat*kdvOran;
        double yeniFiyat = fiyat+kdv;
        System.out.println("KDV'li fiyat = " + yeniFiyat);
        System.out.println("KDV tutarı = " + kdv);
    }
}
