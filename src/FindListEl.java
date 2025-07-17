import java.util.ArrayList;
import java.util.List;

public class FindListEl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(findElList(list, 7, 0, list.size()-1));
    }

    public static int findElList(List<Integer> list, int value, int low, int high){
        if(high < low)
            return -1;
        int mid = (low+high)/2;
        if (list.get(mid) > value){
            high = mid - 1;
            return findElList(list, value, low, high);
        } else if (list.get(mid) < value) {
            low = mid + 1;
            return findElList(list, value, low, high);
        } else
            return mid;
    }
}
