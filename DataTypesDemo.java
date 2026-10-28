
public class DataTypesDemo {
    public static void main(String[] args) {

        byte b = 10;
        short s = 1000;
        int i = 50000;
        long l = 100000L;
        float f = 10.5f;
        double d = 25.678;
        char c = 'A';
        boolean flag = true;

        System.out.println("Primitive Data Types:");
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + flag);

        int num1 = 20;
        int num2 = 10;
        int sum = num1 + num2;

        System.out.println("\nVariables:");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Sum: " + sum);

        int number = 100;
        double convertedNumber = number;

        System.out.println("\nType Conversion:");
        System.out.println("Integer Value: " + number);
        System.out.println("Converted Double Value: " + convertedNumber);

        double value = 99.99;
        int castedValue = (int) value;

        System.out.println("\nType Casting:");
        System.out.println("Double Value: " + value);
        System.out.println("Casted Integer Value: " + castedValue);
    }
}

