package console;

import java.io.InputStream;
import java.util.Scanner;

import static console.Main.playerCount;

public class PlayerNames {
    public static String[] playerName(InputStream testing) {
        String[] array = new String[2];
        Scanner s = new Scanner(testing);
        System.out.println("Wie Viele Spieler? 1 0der 2?");
        playerCount = s.nextInt();
        if (playerCount == 1) {
            System.out.println("Geben sie einen Namen ein");
            s.next();
            array[0] = s.nextLine();
            array[1] = "bot";
        } else {
            System.out.println("Name Spieler 1");
            s.next();
            array[0] = s.nextLine();
            System.out.println("Name Spieler 2");
            s.next();
            array[1] = s.nextLine();
        }
        return array;
    }

    public static String[] playerName() {
        return playerName(System.in);
    }
}
