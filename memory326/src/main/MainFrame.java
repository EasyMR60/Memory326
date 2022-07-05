package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {

    //Bilder-Bibliothek
    private final String[] pictures = new String[10];
    private final String[] car = new String[20];
    private final String path = "Planes/";
    private final Icon[][] icons = new Icon[5][4];

    //Spiel-Variablen
    public String playerOne;
    public String playerTwo;
    //Buttons
    private JButton[][] buttons;
    private String[][] buttonsPos;
    private final Container pane = this.getContentPane();
    private final int[][] randomNr = {{1, 1, 2, 2, 3},
            {3, 4, 4, 5, 5},
            {6, 6, 7, 7, 8},
            {8, 9, 9, 10, 10}};
    //Kartenvergleiche
    private Icon abgleichEins;
    private int abgleichCount = 3;


    public void initialize() {
        PlayerNames();
        System.out.println(playerOne + " / " + playerTwo);
        new PathGen(pictures);
        new RandomizeInPlace(pictures);
        initializeGui();

        buttonsErstellen();
        new IconGen(pictures, buttons, icons);
        setPic();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void PlayerNames() {
        playerOne = JOptionPane.showInputDialog("Player one");
        playerTwo = JOptionPane.showInputDialog("Player two");
    }

    public void buttonsErstellen() {
        buttons = new JButton[5][4];
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 4; c++) {
                buttons[r][c] = new JButton();
                buttons[r][c].setSize(80, 60);
                pane.add(buttons[r][c]);
                buttons[r][c].addActionListener((ActionListener) this);
            }
        }
        new Randomise(randomNr);
    }

    private void initializeGui() {
        //Fenster size etc.
        this.setSize(500, 400);
        Dimension windowSize = this.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(screenSize.width / 2 - windowSize.width / 2, screenSize.height / 2 - windowSize.height / 2);

        //Pane
        pane.setLayout(new GridLayout(5, 4));
    }

    public void setPic() {
        //Memory Objekte auf die Buttons adden
        buttonsPos = new String[5][4];
        int picCount = 0;
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 4; c++) {
                buttons[r][c].setText(r + "/" + c);
                buttons[r][c].setIcon(icons[r][c]);
                buttons[r][c].setIcon(null);
                picCount++;
            }
            System.out.println();
        }
        System.out.println(pictures[0]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String numbers = (((JButton) e.getSource()).getText());
        String[] split = numbers.split("/");

        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(((JButton) e.getSource()).getName());
        if (abgleichCount % 2 == 1) {
            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 4; c++) {
                    buttons[r][c].setIcon(null);
                }
            }
            buttons[Integer.parseInt(split[0])][Integer.parseInt(split[1])].setIcon(icons[Integer.parseInt(split[0])][Integer.parseInt(split[1])]);
            abgleichEins = ((JButton) e.getSource()).getIcon();
            System.out.println((JButton) e.getSource());
            abgleichCount++;
            ((JButton) e.getSource()).setContentAreaFilled(true);

        } else {
            buttons[Integer.parseInt(split[0])][Integer.parseInt(split[1])].setIcon(icons[Integer.parseInt(split[0])][Integer.parseInt(split[1])]);
            Icon abgleichZwei = ((JButton) e.getSource()).getIcon();
            System.out.println(abgleichEins + " / " + abgleichZwei);
            abgleichCount++;

            ((JButton) e.getSource()).setContentAreaFilled(true);
            if (abgleichEins.equals(abgleichZwei)) {
                ((JButton) e.getSource()).setVisible(false);
                for (int r = 0; r < 5; r++) {
                    for (int c = 0; c < 4; c++) {
                        if (buttons[r][c].getIcon().equals(abgleichZwei)) {
                            buttons[r][c].setVisible(false);
                        }
                    }
                    System.out.println();
                }
            }

        }
    }

    public void dispose() {
        System.exit(0);
    }

    public void setVisible(boolean b) {
        initialize();
        super.setVisible(b);
    }
}