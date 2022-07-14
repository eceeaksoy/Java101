package Odev;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11;
        double muzFiyat = 0.95, patlicanFiyat = 5.0, tutar;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        double armut = keyboard.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        double elma = keyboard.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        double domates = keyboard.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        double muz = keyboard.nextDouble();
        System.out.print("Patlican Kaç Kilo? : ");
        double patlican = keyboard.nextDouble();
        tutar = (armut*armutFiyat) + (elma*elmaFiyat) + (domates*domatesFiyat);
        tutar += (muz*muzFiyat) + (patlican*patlicanFiyat);
        System.out.println("Toplam Tutar: " + tutar);
    }
}
