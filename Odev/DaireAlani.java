package Odev;

import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan, aci;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dairenin yari çapi = ");
        r = keyboard.nextInt();
        System.out.print("Dairenin merkez açisi = ");
        aci = keyboard.nextDouble();
        alan = (pi*r*r*aci)/360.0;
        System.out.println("Dairenin alani = " + alan);
    }
}
