package ru.mirea.task8;

import java.awt.*;

public class Circle extends Shape {
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillOval(40, 40, 60, 60);
        g.setColor(Color.black);
        g.drawOval(40, 40, 60, 60); //FOR CIRCLE

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(300, 100, 80, 80);
        g.setColor(Color.black);
        g.drawOval(300, 100, 80, 80); //FOR CIRCLE

        g.setColor(Color.magenta);
        g.fillOval(600, 600, 60, 60);
        g.setColor(Color.black);
        g.drawOval(600, 600, 60, 60); //FOR CIRCLE

        g.setColor(Color.orange);
        g.fillOval(40, 400, 100, 100);
        g.setColor(Color.black);
        g.drawOval(40, 400, 100, 100); //FOR CIRCLE

        g.setColor(Color.pink);
        g.fillOval(450, 700, 80, 80);
        g.setColor(Color.black);
        g.drawOval(450, 700, 80, 80); //FOR CIRCLE
    }
}