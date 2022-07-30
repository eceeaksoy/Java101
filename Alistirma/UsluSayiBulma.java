package Alistirma;

import java.util.Scanner;

public class UsluSayiBulma {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, k, tot = 1;
        System.out.print("Ussu alinacak sayi: ");
        n = keyboard.nextInt();
        System.out.print("Us olacak sayi: ");
        k = keyboard.nextInt();

        int i = 1;
        if (k!=0)
        {
            while (i <= k)
            {
                tot *= n;
                i++;
            }
        }

        System.out.println(n + "^" + k + " = " + tot);
    }
}
