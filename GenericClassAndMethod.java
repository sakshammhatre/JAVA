
class Box<T> {
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

class GenericClassAndMethod {

    static <T> void display(T data) {
        System.out.println("Value: " + data);
    }

    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Java Programming");

        System.out.println("Generic Class:");
        System.out.println("Integer Value: " + intBox.getValue());
        System.out.println("String Value: " + stringBox.getValue());

        System.out.println("\nGeneric Method:");
        display(500);
        display("Hello Java");
        display(25.5);
    }
}
