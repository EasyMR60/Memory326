package console;

import static console.ConsoleMemory.Karten;
import static console.ConsoleMemory.checker;
import static console.PlayerNames.playerName;

public class Main {
    public static int playerCount;
    public static String botEingabe;
    public static String nameOne = "";
    public static int pointsOne= 0;
    public static String nameTwo = "";
    public static int pointsTwo= 0;

    public static void main(String[] args) {

        String botEingabe = "";
        playerName(nameOne, nameTwo);
        checker();
        Game.game(checker, Karten); // calls the game
    }}
