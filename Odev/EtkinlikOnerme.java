package Odev;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Sicakligi girniz: ");
        heat = keyboard.nextInt();
        System.out.println("Yapilabilecek etkinlikler:");

        if (heat < 5)
        {
            System.out.println("-Kayak");
        }
        else if ((heat <= 15) && (heat >= 5))
        {
            System.out.println("-Sinema");
            if (heat >= 10)
            {
                System.out.println("-Piknik");
            }
        }
        else if ((heat > 15) && (heat <= 25))
        {
            System.out.println("-Piknik");
        }
        else
        {
            System.out.println("-Yuzme");
        }
    }
}
