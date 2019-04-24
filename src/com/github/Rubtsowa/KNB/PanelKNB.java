package com.github.Rubtsowa.KNB;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.*;
import java.awt.event.*;
import java.io.IOException;

public class PanelKNB extends JPanel {
    private JPanel       rulesPanel;
    private JPanel       gamePanel;
    private JLabel       rulesArea;
    private JPanel       compPole;
    private JPanel       ochki;
    private JPanel       yourPole;
    private JPanel       yourP;
    private JPanel       knopki;
    private ModelKNB     knb;
    private JLabel       score;

    public PanelKNB(ModelKNB knb){
        this.knb = knb;
        setLayout(new BorderLayout());
        rulesPanel = new JPanel();
        gamePanel = new JPanel();
        rulesPanel.setLayout(new BorderLayout());
        gamePanel.setLayout(new BorderLayout());
        rulesArea = new JLabel();
        rulesPanel.add(new JScrollPane(rulesArea), BorderLayout.CENTER);
        this.add(rulesPanel, BorderLayout.NORTH);
        this.add(gamePanel, BorderLayout.SOUTH);
        rulesArea.setText(rulesStr);
        compPole = new JPanel();
        compPole.setLayout(new BorderLayout());
        ochki = new JPanel();
        ochki.setLayout(new BorderLayout());
        score = new JLabel();
        score.setText(knb.strScore());
        ochki.add(score);
        yourPole = new JPanel();
        yourPole.setLayout(new BorderLayout());
        gamePanel.add(yourPole, BorderLayout.EAST);
        gamePanel.add(ochki, BorderLayout.CENTER);
        gamePanel.add(compPole, BorderLayout.WEST);
        yourP = new JPanel();
        yourP.setLayout(new BorderLayout());
        knopki = new JPanel();
        knopki.setLayout(new BorderLayout());
        yourPole.add(yourP, BorderLayout.NORTH);
        yourPole.add(knopki, BorderLayout.SOUTH);
        JLabel imageCom = new JLabel(new ImageIcon("knb.jpg"));
        JLabel imageYou = new JLabel(new ImageIcon("knb.jpg"));
        compPole.add(imageCom);
        yourP.add(imageYou);
        JButton kButton = new JButton("Камень");
        knopki.add(kButton, BorderLayout.WEST);
        kButton.addActionListener(event ->{
            int gi = knb.gener();
            if (gi==0){
                compPole.removeAll();
                JLabel imageComp = new JLabel(new ImageIcon("k1.png"));
                compPole.add(imageComp);
            }
            else {
                if (gi==1)
                {
                    compPole.removeAll();
                    JLabel imageComp = new JLabel(new ImageIcon("n1.png"));
                    compPole.add(imageComp);
                }
                else {
                    compPole.removeAll();
                    JLabel imageComp = new JLabel(new ImageIcon("b1.png"));
                    compPole.add(imageComp);
                }
            }
            knb.hod(0,gi);
            String txt = knb.strScore();
            score.setText(txt);
            yourP.removeAll();
            JLabel imageYour = new JLabel(new ImageIcon("k2.png"));
            yourP.add(imageYour);
        });
        JButton nButton = new JButton("Ножницы");
        knopki.add(nButton, BorderLayout.CENTER);
        nButton.addActionListener(event ->{
            int gi = knb.gener();
            if (gi==0){
                compPole.removeAll();
                JLabel imageComp = new JLabel(new ImageIcon("k1.png"));
                compPole.add(imageComp);
            }
            else {
                if (gi==1)
                {
                    compPole.removeAll();
                    JLabel imageComp = new JLabel(new ImageIcon("n1.png"));
                    compPole.add(imageComp);
                }
                else {
                    compPole.removeAll();
                    JLabel imageComp = new JLabel(new ImageIcon("b1.png"));
                    compPole.add(imageComp);
                }
            }
            knb.hod(1, gi);
            String txt = knb.strScore();
            score.setText(txt);
            yourP.removeAll();
            JLabel imageYour = new JLabel(new ImageIcon("n2.png"));
            yourP.add(imageYour);
        });
        JButton bButton = new JButton("Бумага");
        knopki.add(bButton, BorderLayout.EAST);
        bButton.addActionListener(event ->{
            int gi = knb.gener();
            if (gi==0){
                compPole.removeAll();
                JLabel imageComp = new JLabel(new ImageIcon("k1.png"));
                compPole.add(imageComp);
            }
            else {
                if (gi==1)
                {
                    compPole.removeAll();
                    JLabel imageComp = new JLabel(new ImageIcon("n1.png"));
                    compPole.add(imageComp);
                }
                else {
                    compPole.removeAll();
                    JLabel imageComp = new JLabel(new ImageIcon("b1.png"));
                    compPole.add(imageComp);
                }
            }
            knb.hod(2, gi);
            String txt = knb.strScore();
            score.setText(txt);
            yourP.removeAll();
            JLabel imageYour = new JLabel(new ImageIcon("b2.png"));
            yourP.add(imageYour);
        });
    }

    private final String rulesStr = "Камень бьёт ножницы, " +
                                    "ножницы режут бумагу, " +
                                    "бумага заворачивает камень.";
}
