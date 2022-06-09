package console;

import java.util.Random;
import java.util.Scanner;

import static console.Main.playerCount;

public class PlayerNames {
    public static void playerName(String nameOne, String nameTwo){
        Scanner s = new Scanner(System.in);
        System.out.println("Wie Viele Spieler? 1 0der 2?");
        playerCount = s.nextInt();
        if(playerCount == 1){
            System.out.println("Geben sie einen Namen ein");
            s.next();
            nameOne = s.nextLine();
            nameTwo = "bot";
        }else{
            System.out.println("Name Spieler 1");
            s.next();
            nameOne = s.nextLine();
            System.out.println("Name Spieler 2");
            s.next();
            nameTwo = s.nextLine();
        }
    }
}
