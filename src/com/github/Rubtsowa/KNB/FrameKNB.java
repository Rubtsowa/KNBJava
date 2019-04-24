package com.github.Rubtsowa.KNB;

import javax.swing.*;

public class FrameKNB extends JFrame {
    private JPanel panel;

    FrameKNB(ModelKNB knb){
        panel = new PanelKNB(knb);
        add (panel);
        pack();
    }
}
