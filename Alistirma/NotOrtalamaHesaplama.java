package Alistirma;

import java.util.Scanner;

public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, tr, tarih, muzik;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Matematik notu: ");
        mat = keyboard.nextInt();
        System.out.print("Fizik notu: ");
        fizik = keyboard.nextInt();
        System.out.print("Kimya notu: ");
        kimya = keyboard.nextInt();
        System.out.print("Turkçe notu: ");
        tr = keyboard.nextInt();
        System.out.print("Tarih notu: ");
        tarih = keyboard.nextInt();
        System.out.print("Muzik notu: ");
        muzik = keyboard.nextInt();
        int toplam = mat+fizik+kimya+tr+tarih+muzik;
        double ort = toplam/6.0;
        System.out.println("Ortalama: " + ort);
    }
}
