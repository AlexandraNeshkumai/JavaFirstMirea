package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TextArea extends JFrame
{
    JTextField jtf = new JTextField(20);
    JMenuBar menuBar = new JMenuBar();
    JMenu mainMenu = new JMenu("Меню");
    JMenu colorMenu = new JMenu("Цвет");
    JMenu fontMenu = new JMenu("Шрифт");
    Font font1 = new Font("Times new roman",Font.PLAIN,18);
    Font font2 = new Font("MS Sans Serif",Font.PLAIN,18);
    Font font3 = new Font("Courier New",Font.PLAIN,18);
    public TextArea()
    {
        setLayout(new FlowLayout());
        setSize(200,200);
        add(jtf);
        jtf.setFont(font1);
        mainMenu.add(fontMenu);
        JMenuItem font1Item = new JMenuItem("Times New Roman");
        fontMenu.add(font1Item);
        font1Item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setFont(font1);
            }
        });
        JMenuItem font2Item = new JMenuItem("MS Sans Serif");
        fontMenu.add(font2Item);
        font2Item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setFont(font2);
            }
        });
        JMenuItem font3Item = new JMenuItem("Courier New");
        fontMenu.add(font3Item);
        font3Item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setFont(font3);
            }
        });
        mainMenu.add(colorMenu);
        JMenuItem color1 = new JMenuItem("Красный");
        colorMenu.add(color1);
        color1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setForeground(Color.RED);
            }
        });
        JMenuItem color2 = new JMenuItem("Синий");
        colorMenu.add(color2);
        color2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setForeground(Color.BLUE);
            }
        });
        JMenuItem color3 = new JMenuItem("Оранжевый");
        colorMenu.add(color3);
        color3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jtf.setForeground(Color.ORANGE);
            }
        });
        mainMenu.addSeparator();
        menuBar.add(mainMenu);
        setJMenuBar(menuBar);
        setPreferredSize(new Dimension(300, 300));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new TextArea();
    }
}
