package Alistirma;

import java.util.Scanner;

public class TekSayilarinToplaminiBulanProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, tot = 0;
        do {
            System.out.print("Sayiyi Giriniz: ");
            n = keyboard.nextInt();
            if (n%2==1)
            {
                tot += n;
            }
        } while (n>0);
        System.out.println("Toplam = " + tot);
    }
}
