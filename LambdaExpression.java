
interface Operation {
    int calculate(int a, int b);
}

class LambdaExpression {
    public static void main(String[] args) {

        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.calculate(10, 5));

        System.out.println("Subtraction: " + subtraction.calculate(10, 5));

        System.out.println("Multiplication: " + multiplication.calculate(10, 5));
    }
}
