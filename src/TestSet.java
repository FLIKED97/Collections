import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> hachSet = new HashSet<>(); //Немає ніякого порядку
        Set<Integer> set2 = new HashSet<>(); //Немає ніякого порядку
        Set<Integer> set1 = new HashSet<>(); //Немає ніякого порядку

        Set<String> linkedSet = new LinkedHashSet<>(); // Зберігається порядок вводу елементів, в якому порядку положили
//        в такому порядку їх получемо
        Set<String> treeHashSet = new TreeSet<>(); // сортується від меншого до більшого, або по алфавіту.


        hachSet.add("Саша");
        hachSet.add("Даня");
        hachSet.add("Аня");
        hachSet.add("Рома");
        hachSet.add("Олег");
        hachSet.add("Олег");
        hachSet.add("Олег");


        for (String name : hachSet){
            System.out.println(name);
        }
        System.out.println("linkedSet");
        linkedSet.add("Даня");
        linkedSet.add("Саша");
        linkedSet.add("Аня");
        linkedSet.add("Рома");
        hachSet.add("Олег");
        hachSet.add("Олег");
        hachSet.add("Олег");

        for (String name : linkedSet){
            System.out.println(name);
        }
        System.out.println("TreeSet");
        treeHashSet.add("Даня");
        treeHashSet.add("Саша");
        treeHashSet.add("Аня");
        treeHashSet.add("Рома");
        hachSet.add("Олег");
        hachSet.add("Олег");
        hachSet.add("Олег");
        for (String name : treeHashSet){
            System.out.println(name);
        }
        System.out.println(hachSet);
        System.out.println(hachSet.contains("Бог"));
        System.out.println(hachSet.contains("Саша"));

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
//        union = об'єднання

        //set1.addAll(set2);
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);
        // intersection - пересічення множин
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);
        // difference - різниця множин
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
    }
}
