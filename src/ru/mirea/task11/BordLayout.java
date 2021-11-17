package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BordLayout extends JFrame
{
    JLabel[] lab = new JLabel[5];
    public BordLayout()
    {
        setLayout(new BorderLayout());
        setSize(300, 300);
        lab[0] = new JLabel("CENTER", SwingConstants.CENTER);
        add(lab[0], BorderLayout.CENTER);
        lab[1] = new JLabel("WEST", SwingConstants.LEFT);
        add(lab[1], BorderLayout.WEST);
        lab[2] = new JLabel("SOUTH", SwingConstants.CENTER);
        add(lab[2], BorderLayout.SOUTH);
        lab[3] = new JLabel("NORTH", SwingConstants.CENTER);
        add(lab[3], BorderLayout.NORTH);
        lab[4] = new JLabel("EAST", SwingConstants.RIGHT);
        add(lab[4], BorderLayout.EAST);
        lab[0].addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Мидгард!", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        lab[1].addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Йотунхейм!", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        lab[2].addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Хель!", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        lab[3].addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Асгард!", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        lab[4].addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e)
            {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Ванахейм!", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new BordLayout();
    }
}