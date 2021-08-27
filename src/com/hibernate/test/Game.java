package com.hibernate.test;

import javax.management.relation.RoleUnresolved;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    private static int ROUND = 0;
    private static String X = "X";
    private static String O = "0";
    private static JButton[] arrays = new JButton[10];
    private static JFrame jFrame = new JFrame("Piškvorky");

    public void setBoard(){
        jFrame.setSize(600,600);
        jFrame.setResizable(false);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        arrays[1] = new JButton("");
        arrays[1].setBounds(0,0,200,200);
        arrays[2] = new JButton("");
        arrays[2].setBounds(200,0,200,200);
        arrays[3] = new JButton("");
        arrays[3].setBounds(400,0,200,200);
        arrays[4] = new JButton("");
        arrays[4].setBounds(0,200,200,200);
        arrays[5] = new JButton("");
        arrays[5].setBounds(200,200,200,200);
        arrays[6] = new JButton("");
        arrays[6].setBounds(400,200,200,200);
        arrays[7] = new JButton("");
        arrays[7].setBounds(0,400,200,200);
        arrays[8] = new JButton("");
        arrays[8].setBounds(200,400,200,200);
        arrays[9] = new JButton("");
        arrays[9].setBounds(400,400,200,200);

        for (int i = 1; i < arrays.length; i++) {
            jFrame.add(arrays[i]);
        }
        jFrame.setVisible(true);

        arrays[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[1].setText(X);
                    arrays[1].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[1].setText(O);
                    arrays[1].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[1].setEnabled(false);
                checkWin();
            }
        });

        arrays[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[2].setText(X);
                    arrays[2].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[2].setText(O);
                    arrays[2].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[2].setEnabled(false);
                checkWin();

            }
        });
        arrays[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[3].setText(X);
                    arrays[3].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[3].setText(O);
                    arrays[3].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[3].setEnabled(false);
                checkWin();

            }
        });
        arrays[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[4].setText(X);
                    arrays[4].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[4].setText(O);
                    arrays[4].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[4].setEnabled(false);
                checkWin();

            }
        });
        arrays[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[5].setText(X);
                    arrays[5].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[5].setText(O);
                    arrays[5].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[5].setEnabled(false);
                checkWin();

            }
        });
        arrays[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[6].setText(X);
                    arrays[6].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[6].setText(O);
                    arrays[6].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[6].setEnabled(false);
                checkWin();

            }
        });
        arrays[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[7].setText(X);
                    arrays[7].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[7].setText(O);
                    arrays[7].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[7].setEnabled(false);
                checkWin();

            }
        });
        arrays[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[8].setText(X);
                    arrays[8].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[8].setText(O);
                    arrays[8].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[8].setEnabled(false);
                checkWin();

            }
        });
        arrays[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ROUND % 2 == 0) {
                    arrays[9].setText(X);
                    arrays[9].setFont(new Font("Arial", Font.BOLD, 150));
                } else {
                    arrays[9].setText(O);
                    arrays[9].setFont(new Font("Arial", Font.BOLD, 150));
                }
                ROUND++;
                arrays[9].setEnabled(false);
                checkWin();
            }
        });
    }

    public void reset(){
        Object[] options1 = { "Ano", "Ne" };
        int choice = JOptionPane.showOptionDialog(null, "Hrát znovu?",
                "Restart",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options1, options1[1]);
        if (choice == 1){
            System.exit(0);
        } else {
            arrays[1].setText("");
            arrays[1].setEnabled(true);
            arrays[2].setText("");
            arrays[2].setEnabled(true);
            arrays[3].setText("");
            arrays[3].setEnabled(true);
            arrays[4].setText("");
            arrays[4].setEnabled(true);
            arrays[5].setText("");
            arrays[5].setEnabled(true);
            arrays[6].setText("");
            arrays[6].setEnabled(true);
            arrays[7].setText("");
            arrays[7].setEnabled(true);
            arrays[8].setText("");
            arrays[8].setEnabled(true);
            arrays[9].setText("");
            arrays[9].setEnabled(true);
            ROUND = 0;
        }
    }

    public void checkWin(){

        if (((arrays[1].getText().equals(X)) && (arrays[2].getText().equals(X)) && (arrays[3].getText().equals(X)))
            || ((arrays[4].getText().equals(X)) && (arrays[5].getText().equals(X)) && (arrays[6].getText().equals(X)))
            || (arrays[7].getText().equals(X)) && (arrays[8].getText().equals(X)) && (arrays[9].getText().equals(X))
            || (arrays[1].getText().equals(X)) && (arrays[4].getText().equals(X)) && (arrays[7].getText().equals(X))
            || (arrays[2].getText().equals(X)) && (arrays[5].getText().equals(X)) && (arrays[8].getText().equals(X))
            || (arrays[3].getText().equals(X)) && (arrays[6].getText().equals(X)) && (arrays[9].getText().equals(X))
            || (arrays[1].getText().equals(X)) && (arrays[5].getText().equals(X)) && (arrays[9].getText().equals(X))
            || (arrays[3].getText().equals(X)) && (arrays[5].getText().equals(X)) && (arrays[7].getText().equals(X))) {
            JOptionPane.showMessageDialog(jFrame, "Vyhrává hráč X", "Konec hry", JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if (((arrays[1].getText().equals(O)) && (arrays[2].getText().equals(O)) && (arrays[3].getText().equals(O)))
                || ((arrays[4].getText().equals(O)) && (arrays[5].getText().equals(O)) && (arrays[6].getText().equals(O)))
                || (arrays[7].getText().equals(O)) && (arrays[8].getText().equals(O)) && (arrays[9].getText().equals(O))
                || (arrays[1].getText().equals(O)) && (arrays[4].getText().equals(O)) && (arrays[7].getText().equals(O))
                || (arrays[2].getText().equals(O)) && (arrays[5].getText().equals(O)) && (arrays[8].getText().equals(O))
                || (arrays[3].getText().equals(O)) && (arrays[6].getText().equals(O)) && (arrays[9].getText().equals(O))
                || (arrays[1].getText().equals(O)) && (arrays[5].getText().equals(O)) && (arrays[9].getText().equals(O))
                || (arrays[3].getText().equals(O)) && (arrays[5].getText().equals(O)) && (arrays[7].getText().equals(O))) {
            JOptionPane.showMessageDialog(jFrame, "Vyhrává hráč O", "Konec hry", JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if (ROUND == 9){
            JOptionPane.showMessageDialog(jFrame, "Remíza!", "Remíza", JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        }
}
