import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
//
//        System.out.println(map);
//
//        map.put(3, "Три обновлено");
//        System.out.println(map);
//
//        System.out.println(map.get(6)); // Повертає null, якщо ключ не найден


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }
    }
}
