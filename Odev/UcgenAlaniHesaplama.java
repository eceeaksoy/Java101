package Odev;

import java.util.Scanner;

public class UcgenAlaniHesaplama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Kenar 1 = ");
        a = keyboard.nextInt();
        System.out.print("Kenar 2 = ");
        b = keyboard.nextInt();
        System.out.print("Kenar 3 = ");
        c = keyboard.nextInt();
        int cevre = a+b+c;
        int u = cevre/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin alani = " + alan);

    }
}
