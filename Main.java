class Student {
    int rollNo;
    String name;
    double marks;

    Student() {
        this.rollNo = 1;
        this.name = "Rahul";
        this.marks = 85.5;
    }

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = 0.0;
    }

    void display() {
        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(2, "Amit", 90.5);
        Student s3 = new Student(3, "Priya");

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("Parameterized Constructor:");
        s2.display();

        System.out.println("Constructor Overloading:");
        s3.display();
    }
}