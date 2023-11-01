package lessons;
import java.util.Random;
import java.util.Scanner;

public class hw777 {
    public static void main(String[] args) {
        char[][] gameBoard = new char[5][5];

        // Initialize the game board
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = '-';
            }
        }

        Random random = new Random();
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);
        gameBoard[targetRow][targetCol] = 'x';

        System.out.println("All Set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!gameWon) {
            System.out.println("  1 2 3 4 5");
            for (int i = 0; i < gameBoard.length; i++) {
                System.out.print(i + 1);
                for (int j = 0; j < gameBoard[i].length; j++) {
                    System.out.print(" ");
                    System.out.print(gameBoard[i][j]);
                }
                System.out.println();
            }

            int row;
            int col;

            System.out.print("Enter row (1-5): ");
            while (!scanner.hasNextInt() || (row = scanner.nextInt()) < 1 || row > 5) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine();
                System.out.print("Enter row (1-5): ");
            }

            System.out.print("Enter column (1-5): ");
            while (!scanner.hasNextInt() || (col = scanner.nextInt()) < 1 || col > 5) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine();
                System.out.print("Enter column (1-5): ");
            }

            row -= 1;
            col -= 1;

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
}
