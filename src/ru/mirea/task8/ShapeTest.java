package ru.mirea.task8;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести команду.\n");
        x = sc.nextInt();
        while (x != 0) {
            if(x == 1)
                new Circle();
            else if (x == 2)
                new Square();
            else if (x == 3)
                new Rectangle();
            else if (x == 4)
                new Triangle();
            System.out.println("Следующая команда.");
            x = sc.nextInt();
            if (x == 0)
                System.out.println("Завершение работы.");
        }
    }
}