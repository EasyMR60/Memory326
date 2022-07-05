package main;

import java.util.Arrays;
import java.util.Random;

public class Randomise {
    public Randomise(int[][] array){
        // Random Objekt der Klasse Random
        Random rd = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array[i].length - 1; j > 0; j--) {
                int m = rd.nextInt(i + 1);
                int n = rd.nextInt(j + 1);

                int temp = array[i][j];
                array[i][j] = array[m][n];
                array[m][n] = temp;
            }
        }
        //ausgabe für Testing des Mischens
        System.out.println(Arrays.toString(array));
    }
}
