package Alistirma;

import java.util.Scanner;

public class DaireAlaniVeCevresi {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, cevre, alan;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dairenin yari çapi = ");
        r = keyboard.nextInt();
        cevre = 2*pi*r;
        alan = pi*r*r;
        System.out.println("Dairenin çevresi = " + cevre);
        System.out.println("Dairenin alani = " + alan);
    }
}
