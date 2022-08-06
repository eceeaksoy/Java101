package Odev;

import java.util.Scanner;

public class RecursiveIleUsHesabi {

    static int result = 1;
    static int usluSayi(int n, int r)
    {
        if (r == 0)
        {
            return 1;
        }
        result *= n;
        usluSayi(n,r-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int n = keyboard.nextInt();
        System.out.print("Us degerini giriniz: ");
        int r = keyboard.nextInt();
        System.out.println("Sonuc: " + usluSayi(n,r));
    }
}
