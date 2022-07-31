package Odev;

public class AsalSayilariBulanProgram {
    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 1; i <= 100; i++)
        {
            sayac = 0;
            for (int j = i; j > 1; j--)
            {
                if (i % j == 0)
                {
                    sayac++;
                }
            }
            if (sayac == 1)
            {
                System.out.print(i + " ");
            }
        }
    }
}
