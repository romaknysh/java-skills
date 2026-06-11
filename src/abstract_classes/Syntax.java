package abstract_classes;

public class Syntax {

    // --- 1. Abstract class ---
    // cannot be instantiated directly
    abstract static class Shape {
        private String color;

        public Shape(String color) {
            this.color = color;
        }

        public String getColor() { return color; }

        // abstract method - no body, must be implemented by subclass
        public abstract double getArea();
        public abstract String getType();

        // regular method - shared by all subclasses
        public void describe() {
            System.out.println(getType() + " color=" + color + " area=" + getArea());
        }
    }

    // --- 2. Extending abstract class ---
    static class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color); // must call parent constructor
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String getType() { return "Circle"; }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(String color, double width, double height) {
            super(color);
            this.width = width;
            this.height = height;
        }

        @Override
        public double getArea() { return width * height; }

        @Override
        public String getType() { return "Rectangle"; }
    }

    public static void main(String[] args) {

        // Shape s = new Shape("red"); // ❌ cannot instantiate abstract class

        Circle c = new Circle("red", 5);
        Rectangle r = new Rectangle("blue", 4, 6);

        c.describe();
        r.describe();

        // polymorphism - Shape as type
        Shape[] shapes = {
                new Circle("green", 3),
                new Rectangle("yellow", 2, 8)
        };

        for (Shape s : shapes) {
            System.out.println(s.getType() + " → " + s.getArea());
        }
    }
}