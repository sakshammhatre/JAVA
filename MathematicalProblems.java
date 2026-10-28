import java.util.Scanner;

public class MathematicalProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        long fact = 1;
        if (n < 0 || n > 20) {
            System.out.println("Factorial is not supported for this input");
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        }

        boolean prime = n >= 2;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += i;
        }

        System.out.println("Sum of odd numbers = " + sum);

        sc.close();
    }
}