package console;

import java.io.InputStream;
import java.util.Scanner;

import static console.Main.playerCount;

public class PlayerNames {
    public static String[] playerName(InputStream testing) {
        String[] array = new String[2];                         //Creating array because its important for testing
        boolean ok = false;                                     //For checking if the player uses allowed count of players
        Scanner s = new Scanner(testing);
        do {
            System.out.println("Wie Viele Spieler? 1 0der 2?");
            playerCount = s.nextInt();
            //Checking if the Player wants a bot
            if (playerCount == 1) {
                System.out.println("Geben sie einen Namen ein");
                array[0] = s.nextLine();
                array[0] = s.nextLine();
                array[1] = "bot";
                ok = true;
            } else if(playerCount == 2){
                System.out.println("Name Spieler 1");
                array[0] = s.nextLine();
                array[0] = s.nextLine();
                System.out.println("Name Spieler 2");
                array[1] = s.nextLine();
                ok = true;
            }else{
                System.out.println("Bitte geben sie ein valide Zahl ein");
            }
        } while (ok != true);
        return array;
    }

    public static String[] playerName() {
        return playerName(System.in);
    }
}
