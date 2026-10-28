import MYpack.AccessDemo;

public class PackageDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println("Access Modifiers:");
        System.out.println("Public: " + obj.a);

        obj.display();
    }
}