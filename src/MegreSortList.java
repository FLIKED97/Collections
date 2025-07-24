import java.util.ArrayList;
import java.util.List;

public class MegreSortList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 7));
        List<Integer> list2 = new ArrayList<>(List.of(2, 3, 6, 8, 9));
        list2.sort((a, b) -> {
            if (a < b){
                return -1;
            } else if (a > b) {
                return 1;
            } else return 0;
        });
        list1.sort((a, b) -> {
              if (a < b){
                return -1;
            } else if (a > b) {
                return 1;
            } else return 0;
        });
        mergeLists(list1, list2);

    }

    private static void mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()){
            if (list1.get(i) <= list2.get(j)){
                merged.add(list1.get(i));
                i++;
            } else if (list1.get(i) >= list2.get(j)){
                merged.add(list2.get(j));
                j++;
            }

        }

        while (i < list1.size()) merged.add(list1.get(i++));
        while (j < list2.size()) merged.add(list2.get(j++));

        System.out.println(merged);
    }

}
