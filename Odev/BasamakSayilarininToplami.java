package Odev;

import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num, basNum = 0, basamak, tot = 0;
        System.out.print("Sayi giriniz: ");
        num = keyboard.nextInt();
        int tempNum = num;

        while (tempNum !=0)
        {
            tempNum /= 10;
            basNum++;
        }
        tempNum = num;

        for (int i = 1; i <= basNum; i++)
        {
            basamak = tempNum % 10;
            tot += basamak;
            tempNum /= 10;
        }

        System.out.println(num + " sayisinin basamaklarinin toplami = " + tot);
    }
}
