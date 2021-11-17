package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame{
    public Shape(){
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public abstract void paint(Graphics g);
}
