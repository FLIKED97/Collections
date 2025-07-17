import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(i);

        System.out.println(list);
        list.contains(3);
        System.out.println(list.get(0));
       // System.out.println(arrayList.get(99));

        list = new LinkedList<>(list);
        System.out.println(list);
    }
}