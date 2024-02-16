package com.OOP_Two;

public class GenericInterface {
    static public interface Assign<MyType> {
        void set(MyType value);

        MyType get();
    }

    static public class Car implements Assign<String> {
        String Name;

        public void set(String Name) {
            this.Name = Name;
        }

        public String get() {
            return this.Name;
        }

    }

    public static void main(String[] args) {
        Car car = new Car();

        car.set("Volkswagen PoloGT");
        System.out.println(car.get());

    }

}
