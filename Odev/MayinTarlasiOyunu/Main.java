package Odev.MayinTarlasiOyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Before start the game...");
        System.out.print("Enter the number of row: ");
        int n = keyboard.nextInt();
        System.out.print("Enter the number of column: ");
        int m = keyboard.nextInt();
        MineSweeper game = new MineSweeper(n,m);
        System.out.println("Welcome to Game of MineSweeper!");
        System.out.println("======START=======");
        game.run();
    }
}
