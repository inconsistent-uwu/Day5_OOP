package com.OOP_Two;

public class Abstract_Implements_Interface {
    public interface Disp {
        void display();

    }

    static public abstract class Vehicle implements Disp {
        public void display() {
            System.out.println("this is abstract class");
        };
    }

    public static class Car extends Vehicle {
        public void display() {
            System.out.println("This is Class Car");
        }

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.display();

    }

}
