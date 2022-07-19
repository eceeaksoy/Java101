package Alistirma;

import java.util.Scanner;

public class HesapMakinesiYapimi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz: ");
        n1 = keyboard.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = keyboard.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seçiminiz: ");
        select = keyboard.nextInt();

        if (select==1)
        {
            System.out.println("Toplam: " + (n1+n2));
        }
        else if (select==2)
        {
            System.out.println("Cikarma: "+ (n1-n2));
        }
        else if (select==3)
        {
            System.out.println("Carpma: " + (n1*n2));
        }
        else if (select==4)
        {
            if (n2!=0)
            {
                System.out.println("Bolme: " + (n1/n2));
            }
            else
                System.out.println("Bir sayi 0'a bolunemez!");
        }
        else
        {
            System.out.println("Yanlis seçim yaptiniz!");
        }
    }
}
