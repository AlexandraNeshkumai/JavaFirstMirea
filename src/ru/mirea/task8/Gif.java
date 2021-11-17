package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Gif extends JFrame {
    public static void main(String[] args) {
        new Gif();
    }

    public Gif() {
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        for(int i=0; i<3; i++) {
            Image img = new ImageIcon("/Users/valera_kudryavtsev/Downloads/1200px-FC_Barcelona.svg.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/valera_kudryavtsev/Downloads/1200px-Manchester_City_FC.svg.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/valera_kudryavtsev/Downloads/FC_Lokomotiv.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/valera_kudryavtsev/Downloads/34384984195_eec2b41136_o1.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}