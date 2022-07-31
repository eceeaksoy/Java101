package Alistirma;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz: ");
        int n1 = keyboard.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        int n2 = keyboard.nextInt();
        int ebob = 1, ekok = 1, temp = 0;

        if (n2 < n1)
        {
            temp = n2;
            n2 = n1;
            n1 = temp;
        }

        for (int k = n1; k >= 1; k--)
        {
            if (n1%k==0 && n2%k==0)
            {
                ebob = k;
                break;
            }
        }

        for (int j = 1; j <= n1*n2; j++)
        {
            if (j%n1==0 && j%n2==0)
            {
                ekok = j;
                break;
            }
        }

        System.out.println("EBOB = " + ebob);
        System.out.println("EKOK = " + ekok);
    }
}
