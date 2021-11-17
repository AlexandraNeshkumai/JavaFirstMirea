package ru.mirea.task8;

import java.awt.*;

public class Triangle extends Shape {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillPolygon(new int[] {30, 55, 80}, new int[] {300, 100, 300}, 3);
        g.setColor(Color.black);
        g.drawPolygon(new int[] {30, 55, 80}, new int[] {300, 100, 300}, 3);
    }
}