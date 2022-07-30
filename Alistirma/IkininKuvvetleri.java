package Alistirma;

import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;

        System.out.print("Sayi giriniz: ");
        n = keyboard.nextInt();

        for (int i = 1; i <= n; i *= 2)
        {
            System.out.println(i);
        }
    }
}
