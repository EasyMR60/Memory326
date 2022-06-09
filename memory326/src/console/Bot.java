package console;

import java.util.Random;

public class Bot {
    public static void main(String[] args) {
        bot();
    }
    public static void bot(){
        int min = 1;
        int max = 3;

        Random random = new Random();

        int valueOne = random.nextInt(max + min) + min;
        int valueTwo = random.nextInt(max + min) + min;
        Main.botEingabe = ("" + valueOne + "" + valueTwo + "");
    }
}