package console;

import java.util.Random;
import java.util.Scanner;

public class ConsoleMemory {

    static int[][] Karten = new int[4][4];
    static boolean checker[][] = new boolean[4][4];
    static Scanner s = new Scanner(System.in);

    //print the board
    public static void checker() {
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < 4; a++) {
                checker[i][a] = false;
            }
        }
        Karten = Randomiser.randomizer(); //Shuffle Karten
    }

    //print the board
    public static void displayBoard(boolean[][] checker, int[][] Karten) {

        System.out.println("     1 2 3 4 ");
        System.out.println("---+---------");
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + (i + 1) + " | ");
            for (int a = 0; a < 4; a++) {
                if (checker[i][a]) {
                    System.out.print(Karten[i][a]);
                    System.out.print(" ");
                } else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}