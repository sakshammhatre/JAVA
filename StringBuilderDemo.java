
public class StringBuilderDemo {
    public static void main(String[] args) {

        String str = "Hello Java";

        System.out.println("Original String: " + str);

        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Substring: " + str.substring(6));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Contains Java: " + str.contains("Java"));
        System.out.println("Replace: " + str.replace("Java", "World"));
        System.out.println("Equals: " + str.equals("Hello Java"));
        System.out.println("Index of Java: " + str.indexOf("Java"));

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("\nStringBuilder Methods:");

        sb.append(" Java");
        System.out.println("Append: " + sb);

        sb.insert(5, " World");
        System.out.println("Insert: " + sb);

        sb.replace(6, 11, "Everyone");
        System.out.println("Replace: " + sb);

        sb.delete(5, 14);
        System.out.println("Delete: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}
