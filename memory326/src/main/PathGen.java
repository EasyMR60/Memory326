package main;

import javax.swing.*;
import java.awt.*;

public class PathGen {
    private int pics = 1;

    Object[] options = {"Planes", "Cars"};
    private Component pane;
    int n = JOptionPane.showOptionDialog(pane,
            "Do you want Plane Pics or Car Pics?",
            "Pictures Choose",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);

    public PathGen(String[] arr){
        int test = 0;
        String path;
        for(int i = 0; i < 10;i++){
            if(pics == 11){
                pics = 1;
            }
            if(n == 0){
                path = "C:\\github\\Memory\\m326_memory\\src\\main\\pictures\\Planes";
            }else{
                path = "C:\\github\\Memory\\m326_memory\\src\\main\\pictures\\Cars";
            }
            arr[i] = path + "\\" + pics +".jpg";
            pics++;
            System.out.println(arr[i]);
        }
    }
}
