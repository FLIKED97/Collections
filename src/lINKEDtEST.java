import java.util.*;

public class lINKEDtEST {
    public static void main(String[] args) {
//        List<Integer> linkedList = new LinkedList<>();
//        List<Integer> arrayList = new ArrayList<>();
//
//        measureTime(linkedList);
//        measureTime(arrayList);

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");


        System.out.println(map);

        map.put(3, "Три обновлено");
        System.out.println(map);

        System.out.println(map.get(6));
    }

    private static void measureTime(List<Integer> list) {



        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++)
            list.add(0, i);

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
