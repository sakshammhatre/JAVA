
import java.util.Arrays;
import java.util.List;

class StreamApi {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6, 3, 4);

        System.out.println("Original List: " + numbers);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 3)
                .toList();

        System.out.println("After filter(): " + filtered);

        List<Integer> mapped = numbers.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println("After map(): " + mapped);

        List<Integer> sorted = numbers.stream()
                .sorted()
                .toList();

        System.out.println("After sorted(): " + sorted);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("After reduce() - Sum: " + sum);
    }
}
