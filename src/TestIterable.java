import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //З нього не ефективно видаляти!
        //Для ефективної зміни - inkedList
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int idx = 0;
        //До 5 джави
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (idx == 1)
                iterator.remove(); //Можна!
            idx++;
        }
        System.out.println(list);
        //Java 5
//        for (int x : list){
////            list.remove(1); Не можна!
//            System.out.println(x);
//        }
    }
}
