package ru.mirea.task2;

public class TestBook {
    public static void main(String[] args) {
        Book book_1 = new Book("Sir Arthur Conan Doyle", "Sherlock Holmes", 413, true);
        Book book_2 = new Book();
        Book book_3 = new Book("Stendhal", "red and black", 640, false);

        System.out.println(book_1);
        System.out.println(book_2);
    }
}
