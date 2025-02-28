package ru.mirea.task6;

class Car implements Nameable{
    private String name;

    public Car(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Country implements Nameable{
    private String name;

    public Country(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Cat implements Nameable{
    private String name;

    public Cat(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class TestNameable {
    public static void main(String[] args) {
        Nameable car = new Car("Toyota");
        Nameable country = new Country("Russia");
        Nameable cat = new Cat("Jerry");

        System.out.println(car.getName());
        System.out.println(country.getName());
        System.out.println(cat.getName());
    }
}
