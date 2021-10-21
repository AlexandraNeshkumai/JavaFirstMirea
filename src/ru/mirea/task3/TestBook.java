package ru.mirea.task3;

public class TestBook {
    public static void main(String[] args)
    {
        Book b1 = new Book("Sir Arthur Conan Doyle", "Sherlock Holmes", "14.10.1892", 892, true);
        Book b2 = new Book();
        Book b3 = new Book("Stendhal", "red and black", "01.01.2000", 131, false);

        b2.setAuthor("Richard");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
