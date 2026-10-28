class Demo {
    static String college = "ABC College";

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    static void displayCollege() {
        System.out.println("College Name: " + college);
    }

    int sum(int... numbers) {
        int total = 0;

        for (int n : numbers) {
            total += n;
        }

        return total;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();

        System.out.println("Method Overloading:");
        System.out.println("Sum of two integers: " + d.add(10, 20));
        System.out.println("Sum of three integers: " + d.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + d.add(5.5, 4.5));

        System.out.println("\nStatic Members:");
        Demo.displayCollege();

        System.out.println("\nVariable-Length Arguments:");
        System.out.println("Sum of two numbers: " + d.sum(10, 20));
        System.out.println("Sum of four numbers: " + d.sum(10, 20, 30, 40));
    }
}