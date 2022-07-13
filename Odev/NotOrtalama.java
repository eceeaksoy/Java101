package Odev;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int mat, fizik, kimya, tr, tarih, muzik;
        System.out.print("Matematik: ");
        mat = keyboard.nextInt();
        System.out.print("Fizik: ");
        fizik = keyboard.nextInt();
        System.out.print("Kimya: ");
        kimya = keyboard.nextInt();
        System.out.print("Turkçe: ");
        tr = keyboard.nextInt();
        System.out.print("Tarih: ");
        tarih = keyboard.nextInt();
        System.out.print("Muzik: ");
        muzik = keyboard.nextInt();

        int toplam = mat+fizik+kimya+tr+tarih+muzik;
        double ort = toplam/6.0;
        System.out.println("Ortalama: " + ort);
        boolean kosul = ort>60;
        String str = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
