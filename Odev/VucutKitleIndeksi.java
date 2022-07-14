package Odev;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, indeks;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
        boy = keyboard.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = keyboard.nextDouble();
        indeks = kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz: " + indeks);
    }
}
