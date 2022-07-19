package Odev;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, islem;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz: ");
        n1 = keyboard.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = keyboard.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Islemi seciniz: ");
        islem = keyboard.nextInt();
        switch(islem)
        {
            case 1:
                System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
                break;
            case 2:
                System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
                break;
            case 3:
                System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
                break;
            case 4:
                if (n2!=0)
                {
                    System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
                }
                else
                {
                    System.out.println("Bir sayi 0'a bolunemez!");
                }
                break;
            default:
                System.out.println("Gecersiz secim!");
        }

    }
}
