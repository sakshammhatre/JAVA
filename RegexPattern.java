
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a mobile number: ");
        String mobile = sc.nextLine();

        Pattern pattern = Pattern.compile("[6-9][0-9]{9}");

        if (pattern.matcher(mobile).matches()) {
            System.out.println("Valid mobile number.");
        } else {
            System.out.println("Invalid mobile number.");
        }

        sc.close();
    }
}
