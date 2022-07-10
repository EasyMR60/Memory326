package console;

import java.util.Random;

public class Bot {
    public static void main(String[] args) {
        bot();                                      //Starting a methode for the Bot for testing
    }
    public static void bot(){
        int min = 1;
        int max = 3;

        Random random = new Random();

        int valueOne = random.nextInt(max + min) + min;        //Random number for picking card one
        int valueTwo = random.nextInt(max + min) + min;        //Random number for picking card two
        Main.botEingabe = ("" + valueOne + "" + valueTwo + "");
    }
}