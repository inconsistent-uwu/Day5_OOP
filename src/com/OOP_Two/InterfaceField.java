package com.OOP_Two;

public class InterfaceField {
    public interface Pi {
        static double pi = 3.14;

        double Area();
    }

    public static class AreaCircle implements Pi {
        double radius;

        public double Area() {
            return pi * radius * radius;
        }

    }

    public static void main(String[] args) {
        AreaCircle circle = new AreaCircle();
        circle.radius = 5;
        System.out.println(circle.Area());

    }
}
