package Odev;

import java.util.Scanner;

public class SifreDegisikligi {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int answer;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Kullanici adiniz: ");
        userName = keyboard.nextLine();

        System.out.print("Sifreniz: ");
        password = keyboard.nextLine();

        if ((userName.equals("eceaksoy")) && (password.equals("12345")))
        {
            System.out.println("Giris yaptiniz!");
        }
        else
        {
            System.out.println("Bilgileriniz yanlis!");
            System.out.println("Sifrenizi sifirlamak istiyor musunuz?\n1-Evet\n2-Hayir");
            answer = keyboard.nextInt();
            if (answer == 1)
            {
                System.out.print("Yeni sifre giriniz: ");
                keyboard.nextLine();
                newPassword = keyboard.nextLine();
                if (newPassword.equals("12345"))
                {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                }
                else
                {
                    System.out.println("Sifre olusturuldu");
                }
            }
        }
    }
}
