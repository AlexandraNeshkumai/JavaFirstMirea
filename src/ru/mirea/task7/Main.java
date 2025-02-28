package ru.mirea.task7;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                                     // which version?
        System.out.println(s1.getArea());                           // which version?
        System.out.println(s1.getPerimeter());                      // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); - ошибка: такого метода нет в абстрактном классе

        Circle c1 = (Circle)s1;                                     // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); - ошибка: объект абстрактного класса не может быть создан

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); - ошибка: такого метода нет в абстрактном классе

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); - ошибка: такого метода нет в абстрактном классе

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        //Rectangle r2 = (Rectangle)s4; - ошибка: нельзя так преобразовывать классы один в другой, s4 это Square
        //System.out.println(r2);
        //System.out.println(r2.getArea());
        //System.out.println(r2.getColor());
        //System.out.println(r2.getSide());  - ошибка: такого метода нет в абстрактном классе
        //System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        //Square sq1 = (Square)r2; - ошибка: нельзя так преобразовывать классы один в другой, r1 это Rectangle
        //System.out.println(sq1);
        //System.out.println(sq1.getArea());
        //System.out.println(sq1.getColor());
        //System.out.println(sq1.getSide());
        //System.out.println(sq1.getLength());

        System.out.println();
        MovablePoint p = new MovablePoint();
        System.out.println(p);
        p.moveUp();
        System.out.println(p);
        MovableRectangle r = new MovableRectangle();
        System.out.println(r);
        r.moveLeft();
        System.out.println(r);
    }
}