package lessons;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class хв777 {
    public static void main(String[] args) {
        char[][] gameBoard = new char[5][5];
        initializeGameBoard(gameBoard);
        placeTarget(gameBoard);

        System.out.println("All Set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!gameWon) {
            printGameBoard(gameBoard);
            int row = getValidInput("Enter row (1-5): ", 1, 5) - 1;
            int col = getValidInput("Enter column (1-5): ", 1, 5) - 1;

            if (gameBoard[row][col] == 'x') {
                gameWon = true;
                System.out.println("You have won!");
            } else {
                System.out.println("Missed! Try again.");
                gameBoard[row][col] = '*';
            }
        }
        scanner.close();
    }

    private static void initializeGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = '-';
            }
        }
    }

    private static void placeTarget(char[][] gameBoard) {
        Random random = new Random();
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);
        gameBoard[targetRow][targetCol] = 'x';
    }

    private static void printGameBoard(char[][] gameBoard) {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(" ");
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    private static int getValidInput(String prompt, int min, int max) {
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                scanner.next();
                System.out.print(prompt);
            }
            input = scanner.nextInt();
        } while (input < min || input > max);
        return input;
    }
}

