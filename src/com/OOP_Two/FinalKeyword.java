package com.OOP_Two;

public class FinalKeyword {
    class Final {
        final public static String PI = "This is a Final Variable";

        public final void FinalFunction() {
            System.out.println("This is a final function");
            System.out.println(PI);
        }

    }

    class ChildClass extends Final {

    }

    final class FinalClass {
        void displayFinalCLass() {
            System.out.println("This is a Final Class function");
        }
    }

    public static void main(String[] args) {
        FinalKeyword instance = new FinalKeyword();
        ChildClass FC = instance.new ChildClass();
        FC.FinalFunction();

    }

}
