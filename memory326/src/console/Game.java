package console;

import java.util.Scanner;

import static console.Bot.bot;
import static console.ConsoleMemory.*;
import static console.Main.botEingabe;
import static console.Main.playerCount;

public class Game {
    static Scanner s = new Scanner(System.in);
    static int anzPlays = 0;                    //counts the total of all picks
    static int k1x;
    static int k1y;
    static int k2x;
    static int k2y;
    static int noDownCards = 16;
    static int botOrNot;

    public static void game(boolean[][] checker, int[][] Karten) {
        //checks if the player whanted a bot or not
        if (playerCount == 1) {
            botOrNot = 0;
        } else {
            botOrNot = 1;
        }
        while (noDownCards > 0) {
            koordinates();
        }
        displayBoard(checker, Karten);
    }

    public static void koordinates() {
        String k1;
        String k2;
        displayBoard(checker, Karten);
        System.out.println("Geben sie Ihre erste Koordinate ein");
        if (botOrNot == 0 && anzPlays % 2 == 1) {
            bot();
            System.out.println(botEingabe);
            k1 = botEingabe;
        } else {
            k1 = s.next();
        }
        k1x = Integer.valueOf(k1.substring(0, 1)) - 1;
        k1y = Integer.valueOf(k1.substring(1, 2)) - 1;
        System.out.println(Karten[k1x][k1y]);


        System.out.println("Geben sie Ihre Zweite Koordinate ein");
        if (botOrNot == 0 && anzPlays % 2 == 1) {
            bot();
            System.out.println(botEingabe);
            k2 = botEingabe;
        } else {
            k2 = s.next();
        }
        k2x = Integer.valueOf(k2.substring(0, 1)) - 1;
        k2y = Integer.valueOf(k2.substring(1, 2)) - 1;
        System.out.println(Karten[k2x][k2y]);
        checkSameCard();
    }

    /*
     * comparing for same cards
     */
    public static void checkSameCard() {
        if (Karten[k1x][k1y] == Karten[k2x][k2y]) {
            System.out.println("Sie haben Zweimal die selbe karte gezogen!!!");
            checker[k1x][k1y] = true;
            checker[k2x][k2y] = true;
            noDownCards -= 2;

            if (anzPlays % 2 == 1) {
                Main.pointsOne++;
            } else {
                Main.pointsTwo++;
            }
        } else {
            anzPlays++;
        }
    }
}
