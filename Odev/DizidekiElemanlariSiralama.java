package Odev;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = keyboard.nextInt();
        System.out.println("Enter the elements:");
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print((i+1) + ". element: ");
            list[i] = keyboard.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sorting: ");
        for (int i : list)
        {
            System.out.print(i + " ");
        }
    }
}
