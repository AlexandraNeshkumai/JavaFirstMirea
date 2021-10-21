package ru.mirea.task5;

public class TestDog {
    public static void main(String[] args) {
        Shepherd sh = new Shepherd("Tommy", 7, "Shepherd");
        Labrador lb = new Labrador("Bobby", 3, "Labrador");

        sh.bark();
        lb.bark();
    }
}
