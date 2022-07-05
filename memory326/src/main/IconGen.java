package main;

import javax.swing.*;
import java.awt.*;

public class IconGen {
    public IconGen(String[] pictures, JButton[][] buttons, Icon[][] icons) {
        int i = 0;
        for (int row = 0; row < icons.length; row++) {
            for (int col = 0; col < icons[row].length; col++) {
                ImageIcon icon = new ImageIcon(String.valueOf(pictures[i]));
                Image img = icon.getImage();
                Image newImg = img.getScaledInstance(buttons[0][0].getWidth(), buttons[0][0].getHeight(), Image.SCALE_SMOOTH);
                icon = new ImageIcon(newImg);
                icons[row][col] = icon;
                i++;
                if(i == 10){
                    i = 0;
                }
            }
        }

    }
}
