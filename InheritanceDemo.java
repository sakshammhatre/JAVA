
class Animal {
    String name = "Animal";

    void display() {
        System.out.println("This is the parent class.");
    }

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    void displayDetails() {
        System.out.println("Parent Name: " + super.name);
        System.out.println("Child Name: " + name);

        super.display();

        super.sound();

        sound();
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println("Inheritance and Method Overriding:");
        d.displayDetails();
    }
}
