package Odev;

import java.util.Scanner;

public class CiftVe4unKatlarininToplaminiBulanProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x, tot = 0;

        do {
            System.out.print("Sayi giriniz: ");
            x = keyboard.nextInt();
            if ((x%2==0) && (x%4==0))
            {
                tot += x;
            }
        } while (x%2==0);
        System.out.println("Toplam = " + tot);
    }
}
