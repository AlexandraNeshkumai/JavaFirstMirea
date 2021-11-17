package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Img extends JFrame {
    public static void main(String[] args) {
        String src = "";
        for (int j=0;j<args.length;j++) {
            src += args[j];
        }
        new Img(src);
    }

    private String src;

    public Img(String src) {
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        this.src = src;
    }

    public void paint(Graphics g) {
        Image img = new ImageIcon(this.getSrc()).getImage();
        g.drawImage(img, 50, 50, 300, 300, null);//выводим img
    }

    public String getSrc() {
        return src;
    }
}