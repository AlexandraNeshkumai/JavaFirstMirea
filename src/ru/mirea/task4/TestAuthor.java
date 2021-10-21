package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Ivan Ivanov", "i_ivanov@gmail.com", 'm');
        Author b = new Author("Alexandra Neshkumai", "a_neshkumai32432324@gmail.com", 'f');

        b.setEmail("a_neshkumai@gmail.com");
        System.out.println(a);
        System.out.println(b);
    }
}
