package Odev;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1, temp = 0;

        System.out.print("n1 = ");
        n1 = keyboard.nextInt();
        System.out.print("n2 = ");
        n2 = keyboard.nextInt();

        if (n2 < n1)
        {
            temp = n2;
            n2 = n1;
            n1 = temp;
        }

        int i = n1, j = 1;
        while (i >= 1)
        {
            if ((n1%i==0) && (n2%i==0))
            {
                ebob = i;
                break;
            }
            i--;
        }
        while (j <= n1*n2)
        {
            if ((j%n1==0) && (j%n2==0))
            {
                ekok = j;
                break;
            }
            j++;
        }

        System.out.println("EBOB = " + ebob);
        System.out.println("EKOK = " + ekok);
    }
}
