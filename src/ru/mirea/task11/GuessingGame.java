package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GuessingGame extends JFrame
{
    JTextField jta = new JTextField(10);
    JButton button = new JButton("Ok");
    int n = 3;
    public GuessingGame()
    {
        super("Игра-угадайка");
        setLayout(new FlowLayout());
        setSize(200,200);
        add(jta);
        add(button);
        int numb = (int)(Math.random()*20);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int enter = Integer.parseInt(jta.getText().trim());
                n--;
                if (n > 0)
                {
                    if (enter == numb)
                    {
                        JOptionPane.showMessageDialog(null, "Поздравляем! Победа за вами!", "Win", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new GuessingGame();
                    }
                    else
                    {
                        if (enter > numb)
                        {
                            JOptionPane.showMessageDialog(null, "А вот и не угадали) Ваше число " + enter + " не подходит! Попробуйте взять число поменьше. У вас ещё " + n + " попыток.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "А вот и не угадали) Ваше число " + enter + " не подходит! Попробуйте взять число побольше. У вас ещё " + n + " попыток.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "А вот и не угадали) К сожалению, попытки кончились! Задуманное число - " + numb, "Game over", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new GuessingGame();
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new GuessingGame();
    }
}