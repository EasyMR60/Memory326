package console;

import static console.ConsoleMemory.Karten;
import static console.ConsoleMemory.checker;
import static console.PlayerNames.playerName;
/*
 * Start the console Version from the memory
 */
public class Main {
    //Basic variables
    public static int playerCount;
    public static String botEingabe;
    public static String nameOne = "";
    public static int pointsOne= 0;
    public static String nameTwo = "";
    public static int pointsTwo= 0;


    public static void main(String[] args) {
        String[] array = playerName();
        nameOne = array[0];
        nameTwo = array[1];
        System.out.println(nameOne + " / " + nameTwo);
        checker();
        Game.game(checker, Karten); // calls the game
    }}
