package Alistirma;

import java.util.Scanner;

public class SinifiGecipKalma {
    public static void main(String[] args) {
        int mat, fizik, tr, kimya, muzik;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = keyboard.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = keyboard.nextInt();
        System.out.print("Turkce notunuz: ");
        tr = keyboard.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = keyboard.nextInt();
        System.out.print("Muzik notunuz: ");
        muzik = keyboard.nextInt();

        double ort = (mat+fizik+tr+kimya+muzik)/5;
        System.out.println("Ortalamaniz: "+ ort);

        if (ort<=55)
        {
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere.");
        }
        else
        {
            System.out.println("Tebrikler, sinifi gectiniz!");
        }
    }
}
