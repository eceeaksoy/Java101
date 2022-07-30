package Odev;

import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;

        System.out.print("Sayi Giriniz: ");
        n = keyboard.nextInt();

        System.out.println("4'un kuvveleri:");
        for (int i = 1; i <= n; i *= 4)
        {
            System.out.println(i);
        }

        System.out.println("\n5'in kuvvetleri:");
        for (int i = 1; i <= n; i *= 5)
        {
            System.out.println(i);
        }

    }
}
