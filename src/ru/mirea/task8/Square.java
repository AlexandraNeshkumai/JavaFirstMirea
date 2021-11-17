package ru.mirea.task8;

import java.awt.*;

public class Square extends Shape {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(80, 100, 200, 200);
        g.setColor(Color.black);
        g.drawRect(80, 100, 200, 200); // FOR SQUARE

        g.setColor(Color.blue);
        g.fillRect(80, 500, 100, 100);
        g.setColor(Color.blue);
        g.drawRect(80, 500, 100, 100); // FOR SQUARE

        g.setColor(Color.red);
        g.fillRect(500, 50, 100, 100);
        g.setColor(Color.red);
        g.drawRect(500, 50, 100, 100); // FOR SQUARE

        g.setColor(Color.green);
        g.fillRect(500, 500, 150, 150);
        g.setColor(Color.green);
        g.drawRect(500, 500, 150, 150); // FOR SQUARE

        g.setColor(Color.orange);
        g.fillRect(650, 300, 100, 100);
        g.setColor(Color.orange);
        g.drawRect(650, 300, 100, 100); // FOR SQUARE
    }
}