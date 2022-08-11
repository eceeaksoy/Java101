import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500;
        int select;

        while (right > 0)
        {
            System.out.print("Kullanici adiniz: ");
            userName = keyboard.nextLine();
            System.out.print("Parolaniz: ");
            password = keyboard.nextLine();

            if (userName.equals("patika") && (password.equals("dev123")))
            {
                System.out.println("Merhaba, Kodluyoruz Bankasi'na hos geldiniz!");
                do {
                    System.out.println("1) Para Yatirma\n" +
                            "2) Para Cekme\n" +
                            "3) Bakiye Sorgulama\n" +
                            "4) Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = keyboard.nextInt();
                    if (select == 1)
                    {
                        System.out.print("Yatiracaginiz para miktari: ");
                        int price = keyboard.nextInt();
                        balance += price;
                    }
                    else if (select == 2)
                    {
                        System.out.print("Cekeceginiz para miktari: ");
                        int price = keyboard.nextInt();
                        if (price > balance)
                        {
                            System.out.println("Yetersiz bakiye!");
                        }
                        else {
                            balance -= price;
                        }
                    }
                    else if (select == 3)
                    {
                        System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar gorusmek uzere!");
                break;
            }
            else {
                right--;
                System.out.println("Hatali kullanici veya sifre!");
                if (right == 0)
                {
                    System.out.println("Hesabiniz bloke olmustur, lutfen banka ile iletisime geciniz.");
                }
                else {
                    System.out.println("Kalan hakkiniz: " + right);
                }
            }
        }
    }
}
