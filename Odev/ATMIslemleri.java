package Odev;

import java.util.Scanner;

public class ATMIslemleri {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int right = 3, balance = 1500, select;
        String userName, password;

        while (right > 0)
        {
            System.out.print("Enter your username: ");
            userName = keyboard.nextLine();
            System.out.print("Enter your password: ");
            password = keyboard.nextLine();

            if ((userName.equals("eceaksoy")) && (password.equals("ece123")))
            {
                System.out.println("Welcome to Patika Bank!");
                do {
                    System.out.println("1) Deposit\n2) Withdrawal\n" +
                            "3) Balance Inquiry\n4) Log Out");
                    System.out.print("Please select the action you want to do: ");
                    select = keyboard.nextInt();
                    switch (select)
                    {
                        case 1:
                            System.out.print("The amount of money you will deposit: ");
                            int price = keyboard.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("The amount of money you will withdraw: ");
                            price = keyboard.nextInt();
                            if (price > balance)
                            {
                                System.out.println("Insufficient Balance!");
                            }
                            else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Hope to see you again, have a nice day!");
                    }
                } while (select != 4);
                break;
            }
            else {
                right--;
                System.out.println("Incorrect username or password!");
                if (right == 0)
                {
                    System.out.println("Your account has been blocked, please contact the bank.");
                }
            }
        }
    }
}
