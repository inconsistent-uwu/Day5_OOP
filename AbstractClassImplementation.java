public class AbstractClassImplementation {
    public static abstract class Shape {
        double length;
        double width;
        double radius;

        abstract double area();
    }

    public static class Rectangle extends Shape {
        void setLength(double length) {
            super.length = length;
        }

        void setWidth(double width) {
            super.width = width;
        }

        double area() {
            return super.length * super.width;
        }
    }

    public static class Circle extends Shape {
        void setRadius(double radius) {

            super.radius = radius;
        }

        double area() {
            return super.radius * super.radius * 3.14;
        }

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.setRadius(5);
        System.out.println("Circle area: " + circle.area());
        rectangle.setLength(6);
        rectangle.setWidth(8);
        System.out.println("Rectangle area: " + rectangle.area());

    }

}
