package Odev;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, tr, kimya, muzik;
        double ort;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = keyboard.nextInt();
        if ((mat<0)||(mat>100))
        {
            mat = 0;
        }

        System.out.print("Fizik notunuz: ");
        fizik = keyboard.nextInt();
        if ((fizik<0)||(fizik>100))
        {
            fizik = 0;
        }

        System.out.print("Turkce notunuz: ");
        tr = keyboard.nextInt();
        if ((tr<0)||(tr>100))
        {
            tr = 0;
        }

        System.out.print("Kimya notunuz: ");
        kimya = keyboard.nextInt();
        if ((kimya<0)||(kimya>100))
        {
            kimya = 0;
        }

        System.out.print("Muzik notunuz: ");
        muzik = keyboard.nextInt();
        if ((muzik<0)||(muzik>100))
        {
            muzik = 0;
        }

        ort = (mat+fizik+tr+kimya+muzik)/5;
        System.out.println("Ortalamaniz: " + ort);

        if (ort <= 55)
        {
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere.");
        }
        else
        {
            System.out.println("Tebrikler, sinifi gectiniz!");
        }
    }
}
