package Odev;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x, y, tot = 1;
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        x = keyboard.nextInt();
        System.out.print("Us olacak sayiyi giriniz: ");
        y = keyboard.nextInt();

        if (y!=0)
        {
            for (int i = 1; i <= y; i++)
            {
                tot *= x;
            }
        }
        System.out.println(x + "^" + y + " = " + tot);

    }
}
