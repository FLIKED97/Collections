import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestLinkedTreeMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); // нЕ ГАРАНТУЄТЬСЯ ПОРЯДОК
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // В ЯКОМУ ПОРЯДКУ БУЛО ДОБАВЛЕНО, В ТАКОМУ І ДОДАЮТЬСЯ
        Map<Integer, String> treeMap = new TreeMap<>(); // ВІДСОРТОВУЄ ЗА КЛЮЧЕМ

       // System.out.println(map.get(6)); // Повертає null, якщо ключ не найден
        System.out.println("LinkedHashMap:");
        TestLinkedTreeMap(linkedHashMap);

        System.out.println("TreeMap:");
        TestLinkedTreeMap(treeMap);

        System.out.println("HashMap:");
        TestLinkedTreeMap(map);
    }

    public static void TestLinkedTreeMap(Map<Integer, String> map) {
        map.put(14, "Один");
        map.put(233, "Два");
        map.put(44, "Три");
        map.put(0, "Bober");
        map.put(1, "Bobik");
        map.put(390, "format");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }

    }
}
