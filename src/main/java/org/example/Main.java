package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        Wall wall = new Wall(5.0,4.0);

        System.out.println("area= " + wall.getArea());
        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());


        wall.setHeight(-1.5);
    }
}
