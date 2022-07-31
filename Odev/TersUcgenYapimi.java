package Odev;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz: ");
        int basamak = keyboard.nextInt();

        for (int i = 1; i <= basamak; i++)
        {
            for (int j = 1; j <= i-1; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*basamak)+1-(2*i); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
