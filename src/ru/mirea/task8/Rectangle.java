package ru.mirea.task8;

import java.awt.*;

public class Rectangle extends Shape {
    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillRect(200, 100, 100, 200);
        g.setColor(Color.black);
        g.drawRect(200, 100, 100, 200); // FOR RECT

        g.setColor(Color.green);
        g.fillRect(400, 200, 100, 70);
        g.setColor(Color.black);
        g.drawRect(400, 200, 100, 70); // FOR RECT

        g.setColor(Color.blue);
        g.fillRect(200, 500, 100, 70);
        g.setColor(Color.black);
        g.drawRect(200, 500, 100, 70); // FOR RECT

        g.setColor(Color.red);
        g.fillRect(400, 600, 100, 70);
        g.setColor(Color.black);
        g.drawRect(400, 600, 100, 70); // FOR RECT

        g.setColor(Color.pink);
        g.fillRect(600, 300, 100, 300);
        g.setColor(Color.black);
        g.drawRect(600, 300, 100, 300); // FOR RECT
    }
}