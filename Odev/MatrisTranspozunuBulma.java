package Odev;

import java.util.Scanner;

public class MatrisTranspozunuBulma {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int n = keyboard.nextInt();
        System.out.print("Enter the number of column: ");
        int m = keyboard.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print("a[" + i + "," + j + "]: ");
                a[i][j] = keyboard.nextInt();
            }
        }

        System.out.println();

        int[][] transpose = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                transpose[i][j] = a[j][i];
            }
        }

        System.out.println("Matris: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Transpoze: ");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
