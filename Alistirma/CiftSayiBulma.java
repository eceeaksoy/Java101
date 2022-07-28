package Alistirma;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int k;
        System.out.print("Sayi giriniz: ");
        k = keyboard.nextInt();

        for (int i = 1; i <= k; i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
