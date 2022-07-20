package Alistirma;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Sicakligi girniz: ");
        heat = keyboard.nextInt();

        if (heat < 5)
        {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if ((heat >= 5) && (heat <= 25))
        {
            if (heat <= 15)
            {
                System.out.println("Sinemaya gidilebilir.");
            }
            if (heat >= 10)
            {
                System.out.println("Piknik yapilabilir.");
            }
        }
        else
        {
            System.out.println("Yuzmeye gidilebilir.");
        }
    }
}
