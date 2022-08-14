package Odev;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayilariBulma {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Array: " + Arrays.toString(list));
        System.out.print("Enter a number: ");
        int n = keyboard.nextInt();
        Arrays.sort(list);
        int min = list[0], max = list[0];
        for (int i : list)
        {
            if (i < n)
            {
                min = i;
            }
            if (i > n)
            {
                max = i;
                break;
            }
        }
        System.out.println("The nearest number smaller than the entered number: " + min);
        System.out.println("The nearest number greater than the entered number: " + max);
    }
}
