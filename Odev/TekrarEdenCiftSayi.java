package Odev;

import java.util.Arrays;
import java.util.Scanner;

public class TekrarEdenCiftSayi {

    static boolean isFind(int[] arr, int value)
    {
        for (int i : arr)
        {
            if (i == value)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of value: ");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] list = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++)
        {
            list[i] = keyboard.nextInt();
        }
        int[] duplicate = new int[n];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0)
                    {
                        if (!isFind(duplicate,list[i]))
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
