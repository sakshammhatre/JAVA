
abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("This is a shape.");
    }
}

interface Color {
    void fill();

    default void showColor() {
        System.out.println("Default color is Blue.");
    }
}

class Circle extends Shape implements Color {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }

    @Override
    public void fill() {
        System.out.println("Filling the Circle with color.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.display();
        c.draw();
        c.fill();

        c.showColor();
    }
}
