package Alistirma;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int kenar1, kenar2;
        double kenar3;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Birinci dik kenar = ");
        kenar1 = keyboard.nextInt();
        System.out.print("Ikinci dik kenar = ");
        kenar2 = keyboard.nextInt();
        kenar3 = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenus = " + kenar3);
    }
}
