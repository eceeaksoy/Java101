package Alistirma;

import java.util.Scanner;

public class YildizIleUcgenYapimi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz: ");
        int n = keyboard.nextInt();
        int star = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <= (n-i); k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i)-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
