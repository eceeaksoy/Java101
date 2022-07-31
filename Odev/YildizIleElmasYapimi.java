package Odev;

import java.util.Scanner;

public class YildizIleElmasYapimi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz: ");
        int n = keyboard.nextInt();

        for (int i = 1; i <= (n/2)+1; i++)
        {
            for (int j = 1; j <= (n/2)+1-i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = 1; a <= n/2; a++)
        {
            for (int b = 1; b <= a; b++)
            {
                System.out.print(" ");
            }
            for (int c = 1; c <= n - (2*a); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
