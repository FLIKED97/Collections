import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIntElInList {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 3, 2, 5, 2, 6, 1, 7, 2};
        findInt(arr);
//        fillArray(arr);

    }

    private static void findInt(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }




















//    private static void findInt(int[] arr) {
//        Map<Integer, Integer> list = new HashMap<>();
//        for(int num : arr){
//            list.put(num, list.getOrDefault(num, 0) + 1);
//        }
//
//        System.out.println(list);
//        List<Integer> duplicates = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : list.entrySet()) {
//            if (entry.getValue() > 1) {
//                duplicates.add(entry.getKey());
//            }
//        }
//        System.out.println(duplicates);
//    }

    private static void fillArray(int[] arr) {
        for (int i = 0; i < 10; i++) {

        }
    }
}
