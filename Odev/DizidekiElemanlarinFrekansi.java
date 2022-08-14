package Odev;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[list.length];

        for (int i = 0; i < list.length; i++)
            frequency[i] = 1;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    frequency[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    list[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            if (frequency[i] >= 1) {
                if (list[i] != 0)
                    System.out.println("Number " + list[i] + " was repeated " + frequency[i] + " times.");
            }
        }
    }
}
