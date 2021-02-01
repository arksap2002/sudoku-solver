import metodsofdisition.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int SIZE = 9;
        int[][] a = new int[SIZE][SIZE];
        boolean[][][] b = new boolean[SIZE][SIZE][SIZE];
        final int[] check = {1};
        final int[] prozent = new int[1];
        JFrame window = new JFrame("Sudoku");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(600, 600);
        JPanel center = new JPanel();
        window.add(center, BorderLayout.CENTER);
        String[] string = {"empty", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<ArrayList<JComboBox<String>>> comboBoxes = new ArrayList<>();
        ArrayList<ArrayList<JLabel>> labels = new ArrayList<>();
        center.setLayout(new GridLayout(SIZE, SIZE));
        for (int i = 0; i < SIZE; i++) {
            ArrayList<JComboBox<String>> tmpCB = new ArrayList<>();
            ArrayList<JLabel> tmpL = new ArrayList<>();
            for (int j = 0; j < SIZE; j++) {
                tmpCB.add(new JComboBox<>(string));
                tmpL.add(new JLabel());
                center.add(tmpCB.get(j));
            }
            labels.add(tmpL);
            comboBoxes.add(tmpCB);
        }
        JPanel down = new JPanel();
        JButton go = new JButton("GO");
        down.setLayout(new FlowLayout());
        down.add(go);
        window.add(down, BorderLayout.SOUTH);
        down.setVisible(true);
        window.setVisible(true);
        window.repaint();
        JFrame label = new JFrame("Sudoku");
        JPanel panel = new JPanel();
        label.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        label.setSize(600, 600);
        panel.setLayout(new GridLayout(9, 9));
        label.add(panel, BorderLayout.CENTER);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                panel.add(labels.get(i).get(j));
            }
        }
        label.setVisible(false);
        go.addActionListener(e -> {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    a[i][j] = comboBoxes.get(i).get(j).getSelectedIndex() - 1;
                }
            }
            window.setVisible(false);
            label.setVisible(true);
            for (int y = 0; y < 9; y++) {
                for (int x = 0; x < 9; x++) {
                    for (int z = 0; z < 9; z++) {
                        b[y][x][z] = true;
                    }
                }
            }
            int procentchange = -1;
            boolean bpocchange = true;
            while (check[0] == 1) {
                prozent[0] = 0;
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        for (int k = 0; k < 9; k++) {
                            if (b[i][j][k]) {
                                prozent[0] = prozent[0] + 1;
                            }
                        }
                    }
                }
                int t = prozent[0] * 100 / 729;
                if (procentchange == 100 - t) {
                    bpocchange = false;
                    break;
                }
                procentchange = 100 - t;
                check[0] = 0;
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (a[i][j] == -1) {
                            check[0] = 1;
                            break;
                        }
                    }
                }
                Andwhoifnotme.Main(a, b);
                NewLastHero.Main(a, b);
                Andwhoifnotme.Main(a, b);
                LastHero.Main(a, b);
                Andwhoifnotme.Main(a, b);
                LastHeroInSquare.Main(a, b);
                Andwhoifnotme.Main(a, b);
                DoublesInStreet.Main(a, b);
                NewDoublesInStreet.Main(a, b);
                DoublesInSquare.Main(a, b);
                ThreePointsInStreet.Main(a, b);
                NewThreePointsInStreet.Main(a, b);
                ThreeInSquare.Main(a, b);
                for (int y = 0; y < 9; y++) {
                    for (int x = 0; x < 9; x++) {
                        int kolvo = 0;
                        int el = 0;
                        for (int z = 0; z < 9; z++) {
                            if (b[y][x][z]) {
                                kolvo = kolvo + 1;
                                el = z;
                            }
                        }
                        if (kolvo == 1) {
                            a[y][x] = el;
                        }
                    }
                }
            }
            window.setVisible(false);
            label.setVisible(true);
            if (bpocchange) {
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        labels.get(i).get(j).setText(Integer.toString(a[i][j] + 1));
                    }
                }
            } else {
                labels.get(0).get(0).setText("Opps");
                panel.setLayout(new GridLayout(0, 1));
                panel.add(labels.get(0).get(0));
            }
            label.repaint();
        });
    }
}
