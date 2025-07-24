import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamStrTest {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "carrot", "dog");
        char target = 'a';
//        long count = words.stream().filter( a -> {
//         for (char c : a.toCharArray()){
//             if (c == target) return true;
//         }
//         return false;
//        }).count();
        long count = words.stream()
                .filter( a -> a.chars()
                        .anyMatch(c -> c == target))
                .count();

        System.out.println(count);
    }
}
