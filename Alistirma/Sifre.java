package Alistirma;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        String userName, password;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Kullanici adiniz: ");
        userName = keyboard.nextLine();

        System.out.print("Sifreniz: ");
        password = keyboard.nextLine();

        if (userName.equals("patika") && (password.equals("java123")))
        {
            System.out.println("Giris yaptiniz!");
        }
        else
        {
            System.out.println("Bilgileriniz yanlis!");
        }
    }
}
