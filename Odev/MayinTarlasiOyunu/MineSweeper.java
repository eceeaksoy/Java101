package Odev.MayinTarlasiOyunu;

import java.util.Scanner;

public class MineSweeper {
    int row, column;
    String[][] arr;
    String[][] answer;
    String[][] answer2;

    public MineSweeper(int row, int column)
    {
        this.row = row;
        this.column = column;
        this.arr = new String[this.row][this.column];
        this.answer = new String[this.row][this.column];
        this.answer2 = new String[this.row][this.column];
    }

    public void run(){
        startGame();
        placeOfMine();
        playGame();
    }

    public void createString(String[][] a){
        for (int i = 0; i < this.row; i++)
        {
            for (int j = 0; j < this.column; j++)
            {
                a[i][j] = "- ";
            }
        }
    }

    public void startGame(){
        createString(this.arr);
        printMap(this.arr);
    }

    public void placeOfMine()
    {
        createString(this.answer);
        createString(this.answer2);
        int mine = (int)(this.row * this.column)/4;
        while (mine > 0)
        {
            int randomRow = (int)(Math.random() * this.row);
            int randomColumn = (int)(Math.random() * this.column);
            if (this.answer[randomRow][randomColumn] != "* ")
            {
                this.answer[randomRow][randomColumn] = "* ";
                this.answer2[randomRow][randomColumn] = "* ";
                mine--;
            }
        }
    }

    public void playGame(){
        boolean play = true;
        Scanner keyboard = new Scanner(System.in);
        while (play)
        {
            System.out.print("Enter a row: ");
            int n = keyboard.nextInt();
            System.out.print("Enter a column: ");
            int m = keyboard.nextInt();
            if (((n >= this.row) || (n < 0)) || ((m >= this.column) || (m < 0)))
            {
                System.out.println("You enter wrong value!");
                System.out.println("==================");
                continue;
            }
            if (this.answer[n][m].equals("* "))
            {
                play = false;
                System.out.println("Game over! You lost!");
                System.out.println("The Map:");
                printMap(this.answer);
                System.out.println("=======END========");
            }
            else if (!this.answer[n][m].equals("* "))
            {
                gameTime(n,m);
                printMap(this.arr);
                System.out.println("==================");
            }
            if (isWin())
            {
                break;
            }
        }
    }

    public void printMap(String[][] a){
        for (int i = 0; i < this.row; i++)
        {
            for (int j = 0; j < this.column; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public void gameTime(int numRow, int numCol){
        int count = 0;
        for (int i = numRow - 1; i <= numRow + 1; i++)
        {
            if (!((i < 0) || (i >= this.row)))
            {
                for (int j = numCol - 1; j <= numCol + 1; j++)
                {
                    if (!((j < 0) || (j >= this.column)))
                    {
                        if (!((i == numRow) && (j == numCol)) && (this.answer[i][j].equals("* ")))
                        {
                            count++;
                        }
                    }
                }
            }
            else {
                continue;
            }
        }
        this.arr[numRow][numCol] = "" + count + " ";
        this.answer2[numRow][numCol] = "" + count + " ";
    }

    public boolean isWin(){
        int numElements = this.row * this.column, count = 0;
        for (int i = 0; i < this.row; i++)
        {
            for (int j = 0; j < this.column; j++)
            {
                if (!(this.answer2[i][j].equals("- ")))
                {
                    count++;
                }
            }
        }
        if (count == numElements)
        {
            System.out.println("Congratulations! You win!");
            return true;
        }
        return false;
    }
}
